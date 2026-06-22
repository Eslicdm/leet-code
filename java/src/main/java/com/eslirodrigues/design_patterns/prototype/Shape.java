package com.eslirodrigues.design_patterns.prototype;

// allows you to copy existing objects without making your code
// dependent on their classes
// Useful when you have a complex class and don't want to create subclasses

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }

    // Static method to demonstrate usage
    public static void call() {
        Circle circle1 = new Circle();
        circle1.x = 10;
        circle1.y = 20;
        circle1.radius = 15;
        circle1.color = "Red";

        Circle circle2 = (Circle) circle1.clone();

        System.out.println("Original: " + circle1);
        System.out.println("Clone: " + circle2);
        System.out.println("Are equals? " + circle1.equals(circle2));

        circle2.color = "Blue";
        System.out.println("Modified Clone: " + circle2);
        System.out.println("Are equals? " + circle1.equals(circle2));
    }
}