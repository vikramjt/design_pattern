package com.vikram.designpatterns.objectpool;

public class App {
    public static void main(String[] args) {
        StringBuilderPool pool = new StringBuilderPool(2);
        PooledStringBuilder first = pool.acquire();
        first.getBuilder().append("hello");
        pool.release(first);

        PooledStringBuilder second = pool.acquire();
        System.out.println(second.getBuilder());
        pool.release(second);
    }
}
