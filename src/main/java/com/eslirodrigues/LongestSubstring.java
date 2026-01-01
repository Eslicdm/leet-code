package com.eslirodrigues;

// PROBLEM: Longest Substring Without Repeating Characters
// * Given a string s, find the length of the longest substring without repeating characters.
// * * Example:
// Input: s = "abcabcbb"
// Output: 3 (The answer is "abc", with the length of 3.)

import java.util.HashSet;

public class LongestSubstring {
    public static void call() {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        var charSet = new HashSet<Character>();
        int left = 0;
        int longest = 0;

        for (int right = 0; right < s.length(); right++) {
            // If duplicate found, remove from the left until the duplicate is gone
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            // Add current character and calculate max length
            charSet.add(s.charAt(right));
            longest = Math.max(longest, right - left + 1);
        }

        return longest;
    }
}
