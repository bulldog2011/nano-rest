package com.leansoft.nanorest.auth;

import com.leansoft.nanorest.client.BaseRestClient;

public interface AuthenticationProvider {

    public void authenticateRequest(BaseRestClient client);
}
