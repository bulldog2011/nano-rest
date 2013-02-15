package com.leansoft.nanorest.request;

import com.leansoft.nanorest.callback.HttpCallback;
import com.leansoft.nanorest.client.BaseRestClient.RequestMethod;
import com.leansoft.nanorest.client.Rest;
import com.leansoft.nanorest.client.StringBodyRestClient;
import com.leansoft.nanorest.exception.HttpException;
import com.leansoft.nanorest.logger.ALog;
import com.leansoft.nanorest.parser.HttpResponseParser;

public abstract class StringBodyHttpRequestImpl<T> extends BaseHttpRequestImpl<T> {

    public static final String TAG = StringBodyHttpRequestImpl.class.getSimpleName();
    private final StringBodyRestClient client;

    public StringBodyHttpRequestImpl(
    		RequestMethod requestMethod,
            final HttpResponseParser<T> parser,
            final HttpCallback<T> callback) {
        super(parser, callback);
        client = new StringBodyRestClient();
        client.setRequestMethod(requestMethod);
    }

    @Override
    protected void prepareAndExecuteRequest() throws HttpException {
        prepareParams();
        client.execute();
    }

    public void setBody(final String body) {
        ALog.d(TAG, "String body" + body);
        client.setBody(body);
    }

    @Override
    public Rest getClient() {
        return client;
    }
}
