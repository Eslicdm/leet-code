package com.eslirodrigues.design_patterns.visitor;

// Concrete Element
public class Circle implements Shape {
    @Override
    public void accept(Visitor visitor) {
        // Double Dispatch: The element calls the specific visit method for its type
        visitor.visit(this);
    }
}