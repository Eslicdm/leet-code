package com.eslirodrigues.design_patterns.template_method;

public class CoffeeMaker extends BeverageMaker {
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}