package com.eslirodrigues.design_patterns.factory_method;

// Concrete Product A
public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by land in a box.");
    }
}