package com.eslirodrigues.design_patterns.visitor;

import java.util.List;

// lets you separate algorithms from the objects on which they operate.
// lets you execute an operation over a set of objects with different classes

public class VisitorApp {

    // Static method to demonstrate usage
    public static void call() {
        List<Shape> shapes = List.of(new Circle(), new Square());

        Visitor exportVisitor = new XmlExportVisitor();

        for (Shape shape : shapes) {
            shape.accept(exportVisitor);
        }
    }
}