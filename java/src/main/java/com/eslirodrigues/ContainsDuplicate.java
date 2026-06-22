package com.eslirodrigues;

// PROBLEM: Contains Duplicate
// * Given an integer array 'nums', return true if any value appears at least twice in the array,
// and return false if every element is distinct.
// * Example:
// Input: nums = [1,2,3,1]
// Output: true

import java.util.HashSet;

public class ContainsDuplicate {
    public static void call() {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    public static boolean containsDuplicate(int[] nums) {
        var uniqueList = new HashSet<Integer>(); // Set don't repeat items

        // early return
        for (int num : nums) if (!uniqueList.add(num)) return true;

        return false;
    }
}
