package com.leansoft.nanorest.client;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpUriRequest;

import com.leansoft.nanorest.auth.AuthenticationProvider;
import com.leansoft.nanorest.client.BaseRestClient.RequestMethod;
import com.leansoft.nanorest.domain.ResponseStatus;
import com.leansoft.nanorest.exception.HttpException;

public interface Rest {

    public abstract int getConnectionTimeout();

    public abstract void setUrl(final String url);

    public abstract String getUrl();

    public abstract void setConnectionTimeout(final int connectionTimeout);

    public abstract int getSocketTimeout();

    public abstract void setSocketTimeout(final int socketTimeout);

    public abstract void setAuthentication(final AuthenticationProvider authProvider);

    public abstract String getResponse();

    public abstract ArrayList<NameValuePair> getHeaders();

    public abstract ArrayList<NameValuePair> getParams();

    public abstract void addHeader(final String name, final String value);

    public abstract void addParam(final String name, final String value);
    
    public void setRequestMethod(RequestMethod requestMethod);
    public RequestMethod getRequestMethod();

    public abstract void executeRequest(final HttpUriRequest request) throws IOException;

    public void execute() throws HttpException;

    public abstract ResponseStatus getResponseStatus();

}
