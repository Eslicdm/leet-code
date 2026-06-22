package com.eslirodrigues.design_patterns.mediator;

// Defines an object that encapsulates how a set of objects interact.
// Promotes loose coupling by keeping objects from referring to each other explicitly.

public interface ChatMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);

    // Static method to demonstrate usage
    static void call() {
        System.out.println("--- Mediator Pattern ---");
        ChatMediator mediator = new ChatRoom();

        User user1 = new ChatUser(mediator, "Alice");
        User user2 = new ChatUser(mediator, "Bob");
        User user3 = new ChatUser(mediator, "Charlie");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hello everyone!");
    }
}