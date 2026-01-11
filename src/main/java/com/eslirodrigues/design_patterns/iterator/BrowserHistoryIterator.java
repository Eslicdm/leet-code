package com.eslirodrigues.design_patterns.iterator;

// Concrete Iterator: Implements the traversal logic
public class BrowserHistoryIterator implements Iterator<String> {
    private BrowserHistory history;
    private int index;

    public BrowserHistoryIterator(BrowserHistory history) {
        this.history = history;
    }

    @Override
    public boolean hasNext() {
        return index < history.getUrls().size();
    }

    @Override
    public String next() {
        return history.getUrls().get(index++);
    }
}