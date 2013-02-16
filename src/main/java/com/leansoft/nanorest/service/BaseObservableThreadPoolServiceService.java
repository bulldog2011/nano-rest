package com.leansoft.nanorest.service;

import java.util.concurrent.TimeUnit;

import com.leansoft.nanorest.RequestProcessor;
import com.leansoft.nanorest.domain.DownloadPriority;
import com.leansoft.nanorest.logger.ALog;

import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;

/** 
 * 
 * @author bulldog 
 * 
 */
public abstract class BaseObservableThreadPoolServiceService extends BaseThreadPoolService {

    public static final String TAG = BaseObservableThreadPoolServiceService.class.getSimpleName();

    /**
     * Use to shut down the service when done, register the worker when its started, unregister when
     * its completed
     */
    public ThreadCountObserver observer = new ThreadCountObserver() {

        private final Handler shutdownHandler = new Handler();
        private final Runnable runnable = new Runnable() {

            @Override
            public void run() {
                ALog.d("Shutting down " + TAG);
                stopSelf();
            }
        };

        @Override
        public void onThreadsFinished() {
            shutdownHandler.postDelayed(runnable, TimeUnit.SECONDS.toMillis(60L));
        }

        @Override
        public void newRunnableRegistered() {
            shutdownHandler.removeCallbacks(runnable);
        }
    };

    @Override
    public IBinder onBind(final Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    /**
     * Used to submit prioritized tasks to the Queue for the file download
     * 
     * @author darko.grozdanovski
     */
    class WorkerThread implements Runnable, WorkerPriority {

        private final DownloadPriority downloadPriority;
        private final RequestProcessor requestProcessor;

        public WorkerThread(final DownloadPriority downloadPriority, final RequestProcessor requestProcessor) {
            super();
            this.downloadPriority = downloadPriority;
            this.requestProcessor = requestProcessor;
        }

        /** @return the priority */
        @Override
        public DownloadPriority getPriority() {
            return downloadPriority;
        }

        @Override
        public void run() {
            observer.registerRunnable(this);
            requestProcessor.invoke();
            observer.unregisterRunnable(this);
        }
    }
}
