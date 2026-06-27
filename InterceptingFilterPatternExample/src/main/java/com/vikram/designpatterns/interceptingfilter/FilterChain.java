package com.vikram.designpatterns.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private final List<Filter> filters = new ArrayList<>();

    public void add(Filter filter) {
        filters.add(filter);
    }

    public String doFilter(Request request) {
        return filters.stream().map(filter -> filter.apply(request)).reduce((a, b) -> a + " | " + b).orElse("no filters");
    }
}
