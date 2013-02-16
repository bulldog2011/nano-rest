package com.leansoft.nanorest.request;

import com.leansoft.nanorest.callback.HttpCallback;
import com.leansoft.nanorest.client.BaseRestClient.RequestMethod;
import com.leansoft.nanorest.client.ParametersRestClient;
import com.leansoft.nanorest.client.RestClient;
import com.leansoft.nanorest.parser.HttpResponseParser;

public abstract class ParameterRequestProcessor<T> extends BaseRequestProcessor<T> {

    public static final String TAG = ParameterRequestProcessor.class.getSimpleName();
    protected ParametersRestClient client;

    public ParameterRequestProcessor(
            final RequestMethod requestMethod,
            final HttpResponseParser<T> parser,
            final HttpCallback<T> callback) {
        super(parser, callback);
        client = new ParametersRestClient();
        client.setRequestMethod(requestMethod);
    }

    @Override
    public RestClient getRestClient() {
        return client;
    }

    public void addParam(final String key, final String value) {
        client.addParam(key, value);
    }
}

