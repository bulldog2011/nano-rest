package com.leansoft.nanorest.request;

import com.leansoft.nanorest.RequestProcessor;
import com.leansoft.nanorest.HttpRequestStore;
import com.leansoft.nanorest.callback.HttpCallback;
import com.leansoft.nanorest.client.RestClient;
import com.leansoft.nanorest.domain.ResponseStatus;
import com.leansoft.nanorest.exception.HttpException;
import com.leansoft.nanorest.handler.ResponseHandler;
import com.leansoft.nanorest.handler.UIThreadResponseHandler;
import com.leansoft.nanorest.logger.ALog;
import com.leansoft.nanorest.parser.HttpResponseParser;

import android.content.Context;

public abstract class BaseRequestProcessor<T> implements RequestProcessor {

    public static final String TAG = BaseRequestProcessor.class.getSimpleName();

    final HttpResponseParser<T> parser;
    ResponseHandler<T> handler;
    final HttpCallback<T> callback;

    public BaseRequestProcessor(final HttpResponseParser<T> parser, final HttpCallback<T> callback) {
        super();
        this.parser = parser;
        this.callback = callback;
    }

    public abstract RestClient getRestClient();


    protected HttpCallback<T> getCallback() {
        return callback;
    }

    public void setResponseHandler(ResponseHandler<T> handler) {
        this.handler = handler;
    }
    
    public ResponseHandler<T> getResponseHandler() {
    	if (handler == null) {
    		handler = new UIThreadResponseHandler<T>(callback);
    	}
    	return this.handler;
    }

    protected HttpResponseParser<T> getParser() {
        return parser;
    }

    @Override
    public void invokeAsync(Context context) {
        HttpRequestStore.getInstance(context).launchServiceIntent(this);
    }
    
    @Override
    public void invoke() {
    	// step 1
    	this.getResponseHandler();
    	
    	// step 2
    	this.prepareRequest();
    	
    	// step 3
    	try {
			this.getRestClient().execute();
		} catch (HttpException e) {
            ResponseStatus responseStatus = ResponseStatus.getConnectionErrorStatus();
            ALog.d(TAG, responseStatus.toString(), e);
            handler.handleError(responseStatus);
            return;
		}
    	
    	// step 4
    	this.handleResponse();
    }
    
    protected abstract void prepareRequest();
    
    protected void handleResponse() {
    	
        final RestClient client = getRestClient();
        final ResponseStatus status = client.getResponseStatus();
        ALog.d(TAG, status.toString());
        if (status.getStatusCode() < 200 || status.getStatusCode() >= 300) {
    		handler.handleError(status);
    		return;
        } else {
        	parseHttpResponse(client.getResponse());
        }
    	
    }
    
    protected void parseHttpResponse(String response) {
        try {
            final T responseData = parser.parse(response);
            handler.handleSuccess(responseData);
        } catch (final Exception e) {
            ResponseStatus responseStatus = ResponseStatus.getParseErrorStatus();
            ALog.d(TAG, responseStatus.toString(), e);
            handler.handleError(responseStatus);
        }
    }
}
