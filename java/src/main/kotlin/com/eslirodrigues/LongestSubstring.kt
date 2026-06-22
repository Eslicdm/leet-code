package com.eslirodrigues

// PROBLEM: Longest Substring Without Repeating Characters
// * Given a string s, find the length of the longest substring without repeating characters.
// * * Example:
// Input: s = "abcabcbb"
// Output: 3 (The answer is "abc", with the length of 3.)

fun longestSubstringCall() {
    print(longestSubstring("abcabcbb"))
}

fun longestSubstring(s: String): Int {
    val charSet = hashSetOf<Char>()
    var left = 0
    var longest = 0

    for (right in 0 until s.length) {
        // If duplicate found, remove from the left until the duplicate is gone
        while (charSet.contains(s[right])) {
            charSet.remove(s[left])
            left++
        }

        // Add current character and calculate max length
        charSet.add(s[right])
        longest = maxOf(longest, right - left + 1)
    }

    return longest
}