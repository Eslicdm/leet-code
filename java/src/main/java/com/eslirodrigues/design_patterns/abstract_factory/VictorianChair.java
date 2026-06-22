package com.eslirodrigues.design_patterns.abstract_factory;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a victorian chair.");
    }
}