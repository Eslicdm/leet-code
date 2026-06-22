package com.eslirodrigues.design_patterns.chain_of_responsibility;

public class Level2Support extends SupportHandler {
    @Override
    public void handleRequest(Priority priority) {
        if (priority == Priority.INTERMEDIATE) {
            System.out.println("Level 2 Support handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(priority);
        }
    }
}