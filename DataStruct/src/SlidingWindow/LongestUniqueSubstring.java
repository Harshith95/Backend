package SlidingWindow;

import java.util.HashSet;

/**
 * 🧩 Problem:
 * Given a string, find the length of the longest substring with all unique (non-repeating) characters.
 * <p>
 * ✨ Why Sliding Window?
 * You're looking at substrings (continuous characters).
 * <p>
 * You want to expand the window until a duplicate appears,
 * then shrink it until it's unique again.
 * <p>
 * ✅ Example:
 * java
 * Copy
 * Edit
 * Input: "abcabcbb"
 * Longest substring without repeating: "abc" → length = 3
 */
public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
//        System.out.println("Length: " + lengthOfLongestSubstring(s));
        HashSet<Character> seen = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;
        while (right < s.length()) {
            if (!seen.contains(s.charAt(right))) {
                System.out.println("Value" + s.charAt(right));
                seen.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                seen.remove(s.charAt(left)); // Shrink window
                left++;
            }
        }
        System.out.println("Max Length :: " + maxLength);
    }
}
