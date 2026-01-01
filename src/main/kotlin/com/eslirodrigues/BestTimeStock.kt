package com.eslirodrigues

// PROBLEM: Best Time to Buy and Sell Stock
// * You are given an array prices where prices[i] is the price of a given stock on the ith day.
// * You want to maximize your profit by choosing a single day to buy one stock and choosing a
// different day in the future to sell that stock.
// * Return the maximum profit you can achieve. If you cannot achieve any profit, return 0.
// * * Example:
// Input: prices = [7,1,5,3,6,4]
// Output: 5 (Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5)

fun maxProfitCall() {
    println(maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
}

fun maxProfit(prices: IntArray): Int {
    var min = Int.MAX_VALUE
    var maxProfit = 0

    for (price in prices) {
        if (price < min) {
            min = price
        } else if (price - min > maxProfit) {
            maxProfit = price - min
        }
    }

    return maxProfit
}