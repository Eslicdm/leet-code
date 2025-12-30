package com.eslirodrigues

// PROBLEM: Two Sum
// * Given an array of integers 'nums' and an integer 'target', return indices of the two numbers
// such that they add up to target.
// * You may assume that each input would have exactly one solution, and you may not use the
// same element twice.
// * Example:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]

fun twoSumCall() {
    println(twoSum(intArrayOf(2, 4, 7, 11, 15), 9).contentToString())
}

// Complexity O(n) instead of O(n2) with double for loop
fun twoSum(nums: IntArray, target: Int): IntArray {
    val indexMap = hashMapOf<Int, Int>()

    for (i in nums.indices) {
        // ex: 9 - 7 = 2, so I need to get the index from hashmap (value 2) (index 0)
        // because 7 + 2 = 9, so I need to check if containsKey (value 2)
        val match = target - nums[i]

        if (indexMap.containsKey(match)) return intArrayOf(indexMap[match]!!, i) // return index

        indexMap[nums[i]] = i // add value and index
    }

    return intArrayOf()
}