package com.eslirodrigues.design_patterns.memento;

// Memento: Stores the internal state of the Originator
public class EditorState {
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}