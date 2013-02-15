package com.leansoft.nanorest.request;

import com.leansoft.nanorest.HttpRequest;
import com.leansoft.nanorest.HttpRequestStore;
import com.leansoft.nanorest.callback.HttpCallback;
import com.leansoft.nanorest.client.Rest;
import com.leansoft.nanorest.domain.ResponseStatus;
import com.leansoft.nanorest.exception.HttpException;
import com.leansoft.nanorest.handler.ResponseHandler;
import com.leansoft.nanorest.handler.UIThreadResponseHandler;
import com.leansoft.nanorest.logger.ALog;
import com.leansoft.nanorest.parser.HttpResponseParser;

import android.content.Context;

public abstract class BaseHttpRequestImpl<T> implements HttpRequest {

    public static final String TAG = BaseHttpRequestImpl.class.getSimpleName();

    private final HttpResponseParser<T> parser;
    private ResponseHandler<T> handler;
    private final HttpCallback<T> callback;

    public BaseHttpRequestImpl(final HttpResponseParser<T> parser, final HttpCallback<T> callback) {
        super();
        this.parser = parser;
        this.callback = callback;
    }

    public abstract Rest getClient();


    protected HttpCallback<T> getCallback() {
        return callback;
    }

    public void setHandler(ResponseHandler<T> handler) {
        this.handler = handler;
    }

    protected HttpResponseParser<T> getParser() {
        return parser;
    }

    protected void runRequest() {

        if (handler == null) {
            handler = new UIThreadResponseHandler<T>(callback);
        }

        final Rest client = getClient();
        try {
            prepareAndExecuteRequest();
            // Execute the HTTP request
        } catch (final Exception e) {
            ResponseStatus responseStatus = ResponseStatus.getConnectionErrorStatus();
            ALog.d(TAG, responseStatus.toString(), e);
            handler.handleError(responseStatus);
            return;
        }

        final ResponseStatus status = client.getResponseStatus();
        ALog.d(TAG, status.toString());
        if (status.getStatusCode() < 200 || status.getStatusCode() >= 300) {
        	if (!isXmlResponse(client.getResponse())) { // if response is xml, ignore http error
        		handler.handleError(status);
        		return;
        	}
        }

        try {
            final T responseData = parser.parse(client.getResponse());
            handler.handleSuccess(responseData);
        } catch (final Exception e) {
            ResponseStatus responseStatus = ResponseStatus.getParseErrorStatus();
            ALog.d(TAG, responseStatus.toString(), e);
            handler.handleError(responseStatus);
        }

    }
    
    private boolean isXmlResponse(String response) {
    	if (response == null) return false;
    	return response.startsWith("<?xml");
    }

    @Override
    public void executeAsync(Context context) {
        HttpRequestStore.getInstance(context).launchServiceIntent(this);
    }
    
    @Override
    public void execute() {
    	this.runRequest();
    }

    protected abstract void prepareAndExecuteRequest() throws HttpException;

    protected abstract void prepareParams();
}
