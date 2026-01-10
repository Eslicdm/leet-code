package com.eslirodrigues.design_patterns.flyweight;

public class TreeType {
    private String name;
    private String color;
    private String otherTreeData;

    public TreeType(String name, String color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing Tree [" + name + ", " + color + "] at (" + x + ", " + y + ")");
    }
}