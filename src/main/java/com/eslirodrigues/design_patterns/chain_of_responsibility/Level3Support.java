package com.eslirodrigues.design_patterns.chain_of_responsibility;

public class Level3Support extends SupportHandler {
    @Override
    public void handleRequest(Priority priority) {
        if (priority == Priority.CRITICAL) {
            System.out.println("Level 3 Support handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(priority);
        } else {
            System.out.println("Request cannot be handled.");
        }
    }
}