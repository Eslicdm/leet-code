package com.eslirodrigues;

// PROBLEM: Two Sum
// * Given an array of integers 'nums' and an integer 'target', return indices of the two numbers
// such that they add up to target.
// * You may assume that each input would have exactly one solution, and you may not use the
// same element twice.
// * Example:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]

import java.util.Arrays;
import java.util.HashMap;

// Complexity O(n) instead of O(n2) with double for loop
public class TwoSum {
    public static void call() {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 4, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        var indexMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            // ex: 9 - 7 = 2, so I need to get the index from hashmap (value 2) (index 0)
            // because 7 + 2 = 9, so I need to check if containsKey (value 2)
            var match = target - nums[i];

            if (indexMap.containsKey(match)) {
                return new int[]{indexMap.get(match), i}; // return index
            }

            indexMap.put(nums[i], i); // add value and index
        }

        return new int[]{};
    }
}
