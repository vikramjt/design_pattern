package com.vikram.designpatterns.objectpool;

import java.util.ArrayDeque;
import java.util.Queue;

public class StringBuilderPool {
    private final Queue<PooledStringBuilder> available = new ArrayDeque<>();

    public StringBuilderPool(int size) {
        for (int i = 0; i < size; i++) {
            available.offer(new PooledStringBuilder());
        }
    }

    public PooledStringBuilder acquire() {
        PooledStringBuilder object = available.poll();
        return object != null ? object : new PooledStringBuilder();
    }

    public void release(PooledStringBuilder object) {
        object.reset();
        available.offer(object);
    }
}
