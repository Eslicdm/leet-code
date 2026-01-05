package com.eslirodrigues.design_patterns.singleton;

// ensure that a class has only one instance,
// while providing a global access point to this instance

public class Database {
    // Static variable to hold the single instance
    private static Database instance;

    // Private constructor to prevent instantiation from other classes
    private Database() {
        System.out.println("Database initialized");
    }

    // Public static method to provide access to the instance
    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }

    // Static method to demonstrate usage
    public static void call() {
        Database db1 = Database.getInstance();
        db1.query("SELECT * FROM users");

        Database db2 = Database.getInstance();
        db2.query("SELECT * FROM orders");

        System.out.println("Is same instance? " + (db1 == db2));
    }
}