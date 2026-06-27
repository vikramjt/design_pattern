package com.vikram.designpatterns.singleton;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class App {
    public static void main(String[] args) throws InterruptedException {
        AppConfig first = AppConfig.getInstance();
        AppConfig second = AppConfig.getInstance();
        System.out.println(first == second);
        System.out.println(first.getEnvironment());

        ThreadSafeLogger firstLogger = ThreadSafeLogger.getInstance();
        ThreadSafeLogger secondLogger = ThreadSafeLogger.getInstance();
        System.out.println(firstLogger == secondLogger);

        Set<Integer> identities = ConcurrentHashMap.newKeySet();
        CountDownLatch latch = new CountDownLatch(8);
        for (int i = 0; i < 8; i++) {
            new Thread(() -> {
                identities.add(System.identityHashCode(ThreadSafeLogger.getInstance()));
                latch.countDown();
            }).start();
        }
        latch.await();
        System.out.println(identities.size() == 1);
    }
}
