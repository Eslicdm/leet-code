package com.eslirodrigues.design_patterns.template_method;

// lets subclasses redefine certain steps of an algorithm without
// changing the algorithm's structure
// Use when classes have steps in common

public abstract class BeverageMaker {

    // Template method - final so subclasses can't change the structure
    public final void makeBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Static method to demonstrate usage
    public static void call() {
        var tea = new TeaMaker();
        tea.makeBeverage();

        System.out.println();

        var coffee = new CoffeeMaker();
        coffee.makeBeverage();
    }
}