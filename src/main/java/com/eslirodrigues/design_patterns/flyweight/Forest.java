package com.eslirodrigues.design_patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

// Lets you fit more objects into the available amount of RAM by sharing
// common parts of state between multiple objects

public class Forest {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void paint() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }

    // Static method to demonstrate usage
    public static void call() {
        System.out.println("--- Flyweight Pattern ---");
        Forest forest = new Forest();

        forest.plantTree(1, 1, "Oak", "Green", "Oak texture");
        forest.plantTree(2, 3, "Oak", "Green", "Oak texture");
        forest.plantTree(5, 7, "Pine", "Dark Green", "Pine texture");
        forest.plantTree(8, 9, "Oak", "Green", "Oak texture");

        forest.paint();

        System.out.println("Total trees: " + forest.trees.size());
        System.out.println("Total tree types: " + TreeFactory.treeTypes.size());
    }
}