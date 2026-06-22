package com.eslirodrigues

// PROBLEM: Contains Duplicate
// * Given an integer array 'nums', return true if any value appears at least twice in the array,
// and return false if every element is distinct.
// * Example:
// Input: nums = [1,2,3,1]
// Output: true

fun containsDuplicateCall() {
    print(containsDuplicate(intArrayOf(1, 2, 3, 1)))
}

fun containsDuplicate(nums: IntArray): Boolean {
    val uniqueList = hashSetOf<Int>() // Set don't repeat items

    // early return
    nums.forEach { num -> if (!uniqueList.add(num)) return true }

    return false
}