package com.eslirodrigues.design_patterns.visitor;

// Visitor Interface: Declares a visit method for each concrete element class
public interface Visitor {
    void visit(Circle circle);
    void visit(Square square);
}