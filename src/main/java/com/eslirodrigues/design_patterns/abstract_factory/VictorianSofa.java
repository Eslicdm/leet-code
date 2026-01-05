package com.eslirodrigues.design_patterns.abstract_factory;

public class VictorianSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a victorian sofa.");
    }
}