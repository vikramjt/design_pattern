package com.vikram.designpatterns.iterator;

import java.util.Iterator;

public class NameCollection implements Iterable<String> {
    private final String[] names;

    public NameCollection(String... names) {
        this.names = names;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            private int index;

            @Override
            public boolean hasNext() {
                return index < names.length;
            }

            @Override
            public String next() {
                return names[index++];
            }
        };
    }
}
