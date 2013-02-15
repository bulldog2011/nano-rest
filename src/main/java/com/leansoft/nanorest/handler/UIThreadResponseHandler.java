package com.leansoft.nanorest.handler;

import com.leansoft.nanorest.callback.HttpCallback;
import com.leansoft.nanorest.domain.ResponseStatus;

import android.os.Handler;
import android.os.Looper;

public class UIThreadResponseHandler<T> extends BackgroundThreadResponseHandler<T> implements ResponseHandler<T> {

    public static final String TAG = UIThreadResponseHandler.class.getSimpleName();
    private static Handler handler;

    public UIThreadResponseHandler(HttpCallback<T> callback) {
        super(callback);
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
    }

    @Override
    public void handleSuccess(final T responseData) {
        handler.post(new Runnable() {

            @Override
            public void run() {
                if (callback != null) {
                    callback.onSuccess(responseData);
                }
            }
        });
    }

    @Override
    public void handleError(final ResponseStatus status) {
        handler.post(new Runnable() {

            @Override
            public void run() {
                if (callback != null) {
                    callback.onHttpError(status);
                }
            }
        });
    }
}
