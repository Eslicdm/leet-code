package com.eslirodrigues.design_patterns.abstract_factory;

// Abstract Factory: interface for creating families of related or dependent objects
// without specifying their concrete classes.

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();

    // Static method to demonstrate usage
    static void call() {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();

        modernChair.sitOn();
        modernSofa.lieOn();

        System.out.println();

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();

        victorianChair.sitOn();
        victorianSofa.lieOn();
    }
}