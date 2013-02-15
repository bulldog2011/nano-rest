package com.leansoft.nanorest.service;

import com.leansoft.nanorest.HttpRequestStore;
import com.leansoft.nanorest.domain.RequestOptions;
import com.leansoft.nanorest.domain.RequestWrapper;

import android.content.Intent;


public class HTTPRequestExecutorService extends BaseObservableThreadPoolServiceService {

    @Override
    public void handleIntent(final Intent intent) {
        RequestWrapper wrapper = HttpRequestStore.getInstance(getApplicationContext()).getRequest(intent);
        RequestOptions options = wrapper.getOptions();
        if (options.shouldRunInSingleThread() == false) {
            getFixedSizePoolExecutor().execute(new WorkerThread(options.getPriority(), wrapper.getRequest()));
            return;
        }

        // Handle according to options

        getSingleThreadExecutorService().execute(new WorkerThread(options.getPriority(), wrapper.getRequest()));

    }

}
