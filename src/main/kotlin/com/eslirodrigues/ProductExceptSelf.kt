package com.eslirodrigues

// PROBLEM: Product of Array Except Self
// * Given an integer array nums, return an array answer such that answer[i] is equal to the
// product of all the elements of nums except nums[i].
// * You must write an algorithm that runs in O(n) time and without using the division operation.
// * Example:
// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]

fun productExceptSelfCall() {
    println(productExceptSelf(intArrayOf(1, 2, 3, 4)).contentToString())
}

fun productExceptSelf(nums: IntArray): IntArray {
    val numsLength = nums.size
    val resultList = IntArray(numsLength)

    // Fill the resultList with 1 to prepare for multiplication
    resultList.fill(1)

    // Left side multiplication pass
    var left = 1
    for (i in 0 until numsLength) {
        resultList[i] *= left
        left *= nums[i]
    }

    // Right side multiplication pass
    var right = 1
    for (i in numsLength - 1 downTo 0) {
        resultList[i] *= right
        right *= nums[i]
    }

    return resultList
}