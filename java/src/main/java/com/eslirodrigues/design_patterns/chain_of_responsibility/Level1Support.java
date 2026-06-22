package com.eslirodrigues.design_patterns.chain_of_responsibility;

public class Level1Support extends SupportHandler {
    @Override
    public void handleRequest(Priority priority) {
        if (priority == Priority.BASIC) {
            System.out.println("Level 1 Support handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(priority);
        }
    }
}