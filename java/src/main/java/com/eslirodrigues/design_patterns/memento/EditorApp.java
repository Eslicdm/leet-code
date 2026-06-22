package com.eslirodrigues.design_patterns.memento;

// lets you save and restore the previous state of an object
// without revealing the details of its implementation

public class EditorApp {

    // Static method to demonstrate usage
    public static void call() {
        var editor = new Editor();
        var history = new History();

        // Type "a" and save
        editor.setContent("a");
        history.push(editor.createState());

        // Type "b" and save
        editor.setContent("b");
        history.push(editor.createState());

        // Type "c" (not saved yet)
        editor.setContent("c");

        // Undo: Restores to "b"
        editor.restore(history.pop());
        System.out.println(editor.getContent()); // Output: b

        // Undo: Restores to "a"
        editor.restore(history.pop());
        System.out.println(editor.getContent()); // Output: a
    }
}