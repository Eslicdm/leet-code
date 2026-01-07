package com.eslirodrigues.design_patterns.decorator;

// allows you to attach new behaviors to objects by
// placing these objects inside special wrapper objects that contain the behaviors.
// It is useful when you want to add responsibilities to
// individual objects dynamically without affecting other objects.

public interface Notifier {
    void send(String message);

    // Static method to demonstrate usage
    static void call() {
        // 1. Basic usage
        Notifier emailNotifier = new EmailNotifier("user@example.com");
        System.out.println("1. Basic:");
        emailNotifier.send("Hello World!");

        System.out.println();

        // 2. Decorating with SMS
        Notifier smsNotifier = new SMSDecorator(emailNotifier);
        System.out.println("2. With SMS:");
        smsNotifier.send("Hello World!");

        System.out.println();

        // 3. Decorating with Facebook and SMS
        Notifier facebookSmsNotifier = new FacebookDecorator(
                new SMSDecorator(new EmailNotifier("admin@example.com"))
        );
        System.out.println("3. With Facebook and SMS:");
        facebookSmsNotifier.send("Alert!");
    }
}