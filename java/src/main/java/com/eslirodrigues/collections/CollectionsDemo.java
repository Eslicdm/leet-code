package com.eslirodrigues.collections;

import java.util.*;

public class CollectionsDemo {

    public static void call() {
        // 1. List
        // Definition: An ordered collection that allows duplicates.
        // When to use: When you need to maintain the insertion order or access elements by index.
        // Example: A playlist of songs.
        List<String> playlist = new ArrayList<>();
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song A"); // Duplicates are fine
        System.out.println("List: " + playlist); // Output: [Song A, Song B, Song A]

        // 2. Set
        // Definition: A collection that contains no duplicate elements.
        // When to use: When you need to ensure uniqueness (e.g., filtering duplicates).
        // Example: A collection of unique user IDs.
        Set<String> userIds = new HashSet<>();
        userIds.add("user123");
        userIds.add("user456");
        userIds.add("user123"); // Duplicate is ignored
        System.out.println("Set: " + userIds); // Output: [user123, user456] (Order not guaranteed)

        // 3. Map
        // Definition: An object that maps keys to values. Keys are unique.
        // When to use: When you need to look up values efficiently using a key.
        // Example: A phone book (Name -> Phone Number).
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Alice", "123-456");
        phoneBook.put("Bob", "789-012");
        System.out.println("Map: " + phoneBook.get("Alice")); // Output: 123-456

        // 4. Deque (Double Ended Queue)
        // Definition: A linear collection that supports insertion and removal at both ends.
        // When to use: When you need a Stack (LIFO) or a Queue (FIFO).
        // Example: Browser history (Back button).
        Deque<String> browserHistory = new ArrayDeque<>();
        browserHistory.push("google.com");
        browserHistory.push("youtube.com"); // Last in
        System.out.println("Deque (Pop): " + browserHistory.pop()); // Output: youtube.com (First out)

        // 5. PriorityQueue
        // Definition: A queue that orders elements based on priority (natural order or comparator).
        // When to use: Task scheduling, pathfinding algorithms.
        // Example: Processing tasks where the smallest number has the highest priority.
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(50);
        priorityQueue.add(10);
        priorityQueue.add(30);
        System.out.println("PriorityQueue (Poll): " + priorityQueue.poll()); // Output: 10 (Smallest first)

        // 6. TreeMap
        // Definition: A map that keeps keys sorted.
        // When to use: When you need to iterate over keys in a specific order.
        // Example: Events sorted by date.
        Map<String, String> sortedEvents = new TreeMap<>();
        sortedEvents.put("2023-12-25", "Christmas");
        sortedEvents.put("2023-01-01", "New Year");
        System.out.println("TreeMap: " + sortedEvents); // Output: {2023-01-01=New Year, 2023-12-25=Christmas}
    }
}