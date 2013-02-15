package com.leansoft.nanorest;

import android.content.Context;

/**
 * The {@link HttpRequest} interface has the responsibility to send a
 * request object to the server which is used for data exchange with the server behind the
 * scene.
 * 
 * 
 * @author bulldog
 * 
 */
public interface HttpRequest {

    /**
     * This method runs in the same thread as the application and launches a service
     * for further server communication in asynchronous way.
     */
    public void executeAsync(Context context);

    /**
     * This method executes the request to the server, may indirectly be executed by executeAsync above.
     */
    public void execute();
}

