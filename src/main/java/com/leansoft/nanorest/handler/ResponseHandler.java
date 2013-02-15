package com.leansoft.nanorest.handler;

import com.leansoft.nanorest.callback.HttpCallback;
import com.leansoft.nanorest.domain.ResponseStatus;

public interface ResponseHandler<T> {

    public HttpCallback<T> getCallback();

    public void handleSuccess(final T responseData);

    public void handleError(final ResponseStatus status);
}
