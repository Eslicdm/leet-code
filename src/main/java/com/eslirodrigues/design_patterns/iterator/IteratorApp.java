package com.eslirodrigues.design_patterns.iterator;

// lets you traverse elements of a collection
// without exposing its underlying representation

public class IteratorApp {

    // Static method to demonstrate usage
    public static void call() {
        var history = new BrowserHistory();
        history.push("google.com");
        history.push("twitter.com");
        history.push("youtube.com");

        Iterator<String> iterator = history.createIterator();

        while (iterator.hasNext()) {
            var url = iterator.next();
            System.out.println(url);
        }
    }
}