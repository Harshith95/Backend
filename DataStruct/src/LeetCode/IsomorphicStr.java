package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * 
 * Two strings s and t are isomorphic if the characters in s can be replaced to
 * get t.
 * 
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character, but a character may map to itself.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "egg", t = "add" Output: true Example 2:
 * 
 * Input: s = "foo", t = "bar" Output: false Example 3:
 * 
 * Input: s = "paper", t = "title" Output: true
 * 
 * @author 91879
 *
 */
public class IsomorphicStr {
	public static void main(String[] args) {
		String s = "aaa", t = "bbb";
		boolean isFlag = isIsomorphic(s, t);
		System.out.println(isFlag);
	}

	public static boolean isIsomorphicMine(String s, String t) {
		int sLen = s.length();
		int tLen = t.length();
		HashMap<Character, Character> hMap = new HashMap<>();
		if (sLen == tLen) {
			for (int i = 0; i < sLen; i++) {
				if (hMap.containsKey(s.charAt(i)) && !hMap.containsValue(t.charAt(i))) {
					return false;
				}
				hMap.put(s.charAt(i), t.charAt(i));
			}
		}

		return true;
	}

	private static boolean isIsomorphic(String s, String t) {
		// base case
		if (s == null || t == null) {
			return false;
		}
		// if 'X' and 'Y' have different lengths, they cannot be isomorphic
		if (s.length() != t.length()) {
			return false;
		}
		// use a map to store a mapping from characters of string 'X' to string 'Y'
		Map<Character, Character> map = new HashMap<>();
		// use set to store a pool of already mapped characters
		Set<Character> set = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i), y = t.charAt(i);

			// if 'x' is seen before
			if (map.containsKey(x)) {
				// return false if the first occurrence of `x` is mapped to a
				// different character
				if (map.get(x) != y) {
					return false;
				}
			}

			// if 'x' is seen for the first time (i.e., it isn't mapped yet)
			else {
				// return false if 'y' is already mapped to some other char in 'X'
				if (set.contains(y)) {
					return false;
				}

				// map 'y' to 'x' and mark it as mapped
				map.put(x, y);
				set.add(y);
			}
		}

		return true;
	}

}
