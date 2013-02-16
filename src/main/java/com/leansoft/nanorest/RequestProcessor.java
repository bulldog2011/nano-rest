package com.leansoft.nanorest;

import android.content.Context;

/**
 * The {@link RequestProcessor} interface has the responsibility to send a
 * request object to the server which is used for data exchange with the server behind the
 * scene.
 * 
 * 
 * @author bulldog
 * 
 */
public interface RequestProcessor {

    /**
     * This method runs in the same thread as the application and launches a service
     * for further server communication in asynchronous way(call invoke below indirectly).
     */
    public void invokeAsync(Context context);

    /**
     * This method executes the request to the server.
     */
    public void invoke();
}

