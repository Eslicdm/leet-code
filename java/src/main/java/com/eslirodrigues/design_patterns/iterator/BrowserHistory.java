package com.eslirodrigues.design_patterns.iterator;

import java.util.ArrayList;
import java.util.List;

// Aggregate: The collection that holds the data
public class BrowserHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        return urls.removeLast();
    }

    public List<String> getUrls() {
        return urls;
    }

    public Iterator<String> createIterator() {
        return new BrowserHistoryIterator(this);
    }
}