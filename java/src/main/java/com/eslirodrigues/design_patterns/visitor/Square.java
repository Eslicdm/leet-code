package com.eslirodrigues.design_patterns.visitor;

// Concrete Element
public class Square implements Shape {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}