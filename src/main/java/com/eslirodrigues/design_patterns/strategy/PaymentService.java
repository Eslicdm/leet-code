package com.eslirodrigues.design_patterns.strategy;

// Strategy Pattern: Defines a family of algorithms, encapsulates each one,
// and makes them interchangeable.
// useful when you want to switch algorithms during runtime
// Strategy usually describes different ways of doing the same thing

public class PaymentService {
    private PaymentStrategy strategy;

    // Strategy can be set at runtime
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processOrder(int cost) {
        if (strategy == null) {
            System.out.println("Please select a payment method.");
            return;
        }
        strategy.pay(cost);
    }

    // Static method to demonstrate usage
    public static void call() {
        PaymentService service = new PaymentService();

        // Pay with Credit Card
        service.setStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        service.processOrder(100);

        // Switch to PayPal at runtime
        service.setStrategy(new PayPalPayment("user@example.com"));
        service.processOrder(200);
    }
}