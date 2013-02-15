package com.leansoft.nanorest.request;

import com.leansoft.nanorest.callback.HttpCallback;
import com.leansoft.nanorest.client.BaseRestClient.RequestMethod;
import com.leansoft.nanorest.client.ParametersRestClient;
import com.leansoft.nanorest.client.Rest;
import com.leansoft.nanorest.exception.HttpException;
import com.leansoft.nanorest.parser.HttpResponseParser;

public abstract class ParameterHttpRequestImpl<T> extends BaseHttpRequestImpl<T> {

    public static final String TAG = ParameterHttpRequestImpl.class.getSimpleName();
    protected ParametersRestClient client;

    public ParameterHttpRequestImpl(
            final RequestMethod requestMethod,
            final HttpResponseParser<T> parser,
            final HttpCallback<T> callback) {
        super(parser, callback);
        client = new ParametersRestClient();
        client.setRequestMethod(requestMethod);
    }

    @Override
    protected void prepareAndExecuteRequest() throws HttpException {
        prepareParams();
        client.execute();
    }

    @Override
    public Rest getClient() {
        return client;
    }

    public void addParam(final String key, final String value) {
        client.addParam(key, value);
    }
}

