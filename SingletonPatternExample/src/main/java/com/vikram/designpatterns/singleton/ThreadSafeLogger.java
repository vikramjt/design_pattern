package com.vikram.designpatterns.singleton;

public final class ThreadSafeLogger {
    private static volatile ThreadSafeLogger instance;

    private ThreadSafeLogger() {
    }

    public static ThreadSafeLogger getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeLogger.class) {
                if (instance == null) {
                    instance = new ThreadSafeLogger();
                }
            }
        }
        return instance;
    }
}
