package com.eslirodrigues.design_patterns.iterator;

// Iterator Interface: Declares methods for traversing a collection
public interface Iterator<T> {
    boolean hasNext();
    T next();
}