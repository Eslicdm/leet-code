package com.eslirodrigues.design_patterns.visitor;

// Concrete Visitor: Implements the operation for each concrete element
public class XmlExportVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("<circle>Shape is Circle</circle>");
    }

    @Override
    public void visit(Square square) {
        System.out.println("<square>Shape is Square</square>");
    }
}