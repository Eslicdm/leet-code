package com.eslirodrigues.design_patterns.visitor;

// Element Interface: Declares an accept method that takes a visitor
public interface Shape {
    void accept(Visitor visitor);
}