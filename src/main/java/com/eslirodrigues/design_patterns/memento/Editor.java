package com.eslirodrigues.design_patterns.memento;

// Originator: The object that creates and restores mementos
public class Editor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        if (state != null) content = state.getContent();
    }
}