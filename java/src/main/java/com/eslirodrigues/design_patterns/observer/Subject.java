package com.eslirodrigues.design_patterns.observer;

// Defines a subscription mechanism to notify multiple objects
// about any events that happen to the object they're observing.
// Subscribers are notified in random order.

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();

    // Static method to demonstrate usage
    static void call() {
        System.out.println("--- Observer Pattern ---");
        NewsAgency agency = new NewsAgency();

        Observer channel1 = new NewsChannel("CNN");
        Observer channel2 = new NewsChannel("BBC");

        agency.attach(channel1);
        agency.attach(channel2);

        agency.setNews("Breaking News: Observer Pattern is cool!");

        System.out.println();

        agency.detach(channel1);
        agency.setNews("Update: CNN has unsubscribed.");
    }
}