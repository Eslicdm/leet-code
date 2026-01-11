package com.eslirodrigues.design_patterns.memento;

import java.util.Stack;

// Caretaker: Keeps track of the mementos
public class History {
    private Stack<EditorState> states = new Stack<>();

    public void push(EditorState state) {
        states.push(state);
    }

    public EditorState pop() {
        if (!states.isEmpty()) {
            return states.pop();
        }
        return null;
    }
}