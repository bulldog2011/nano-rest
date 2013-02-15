package com.leansoft.nanorest.service;

import java.util.LinkedList;

import com.leansoft.nanorest.logger.ALog;


/** 
 * 
 * @author bulldog
 * 
 */
public abstract class ThreadCountObserver {

    public static final String TAG = ThreadCountObserver.class.getSimpleName();

    public abstract void onThreadsFinished();

    public abstract void newRunnableRegistered();

    LinkedList<Runnable> observerList = new LinkedList<Runnable>();

    public void registerRunnable(final Runnable r) {
        synchronized (observerList) {
            observerList.add(r);
        }
        newRunnableRegistered();
        ALog.d(TAG, "observer list size on register: " + observerList.size());
    }

    public void unregisterRunnable(final Runnable r) {
        synchronized (observerList) {
            observerList.remove(r);
        }
        ALog.d(TAG, "observer list size on unregister: " + observerList.size());
        if (observerList.size() == 0) {
            ALog.d(TAG, "observer calling finish method");
            onThreadsFinished();
        }
    }
}
