package com.leansoft.nanorest.request;

import com.leansoft.nanorest.callback.HttpCallback;
import com.leansoft.nanorest.client.BaseRestClient.RequestMethod;
import com.leansoft.nanorest.client.RestClient;
import com.leansoft.nanorest.client.StringBodyRestClient;
import com.leansoft.nanorest.logger.ALog;
import com.leansoft.nanorest.parser.HttpResponseParser;

public abstract class StringBodyRequestProcessor<T> extends BaseRequestProcessor<T> {

    public static final String TAG = StringBodyRequestProcessor.class.getSimpleName();
    private final StringBodyRestClient client;

    public StringBodyRequestProcessor(
    		RequestMethod requestMethod,
            final HttpResponseParser<T> parser,
            final HttpCallback<T> callback) {
        super(parser, callback);
        client = new StringBodyRestClient();
        client.setRequestMethod(requestMethod);
    }

    public void setBody(final String body) {
        ALog.d(TAG, "String body" + body);
        client.setBody(body);
    }

    @Override
    public RestClient getRestClient() {
        return client;
    }
}
