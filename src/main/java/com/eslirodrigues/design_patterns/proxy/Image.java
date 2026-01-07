package com.eslirodrigues.design_patterns.proxy;

// Provides a surrogate or placeholder for another object to control access to it.
// Useful for lazy loading, access control, logging, cache, etc.

public interface Image {
    void display();

    // Static method to demonstrate usage
    static void call() {
        System.out.println("--- Proxy Pattern ---");
        Image image = new ProxyImage("test_10mb.jpg");

        // Image will be loaded from the disk
        System.out.println("First call to display():");
        image.display();

        System.out.println();

        // Image will not be loaded from disk (cached in proxy)
        System.out.println("Second call to display():");
        image.display();
    }
}