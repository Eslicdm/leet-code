package com.eslirodrigues;

// PROBLEM: Product of Array Except Self
// * Given an integer array nums, return an array answer such that answer[i] is equal to the
// product of all the elements of nums except nums[i].
// * You must write an algorithm that runs in O(n) time and without using the division operation.
// * Example:
// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]

import java.util.Arrays;

public class ProductExceptSelf {
    public static void call() {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;
        var resultList = new int[numsLength];

        // Fill the resultList with 1 to prepare for multiplication
        Arrays.fill(resultList, 1);

        // Left side multiplication pass
        int left = 1;
        for (int i = 0; i < numsLength; i++) {
            resultList[i] *= left;
            left *= nums[i];
        }

        // Right side multiplication pass
        int right = 1;
        for (int i = numsLength - 1; i >= 0; i--) {
            resultList[i] *= right;
            right *= nums[i];
        }

        return resultList;
    }
}
