package com.eslirodrigues.design_patterns.composite;

// Composes objects into tree structures to represent part-whole hierarchies.
// It lets clients treat individual objects and compositions of objects uniformly.

public interface FileSystemComponent {
    void showDetails();

    // Static method to demonstrate usage
    static void call() {
        System.out.println("--- Composite Pattern ---");
        FileSystemComponent file1 = new File("File1.txt");
        FileSystemComponent file2 = new File("File2.txt");
        FileSystemComponent file3 = new File("File3.txt");

        Directory dir1 = new Directory("Folder 1");
        dir1.addComponent(file1);
        dir1.addComponent(file2);

        Directory dir2 = new Directory("Folder 2");
        dir2.addComponent(file3);
        dir2.addComponent(dir1);

        dir2.showDetails();
    }
}