package LeetCode;

import java.util.Stack;

/**
 * Given two strings s and t, return true if they are equal when both are typed
 * into empty text editors. '#' means a backspace character.
 * 
 * Note that after backspacing an empty text, the text will continue empty.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "ab#c", t = "ad#c"
 * 
 * Output: true Explanation: Both s and t become "ac".
 * 
 * Example 2:
 * 
 * Input: s = "ab##", t = "c#d#"
 * 
 * Output: true Explanation: Both s and t become "".
 * 
 * Example 3:
 * 
 * Input: s = "a#c", t = "b"
 * 
 * Output: false Explanation: s becomes "c" while t becomes "b".
 *
 * 
 */

public class BackStringProb {
	public static void main(String[] args) {
		// # is back space remove b
		String str = "ab#c";
		String secStr = "ac#c";

		if (build(str).equals(build(secStr))) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	private static String build(String str) {
		Stack<Character> ans = new Stack<>();
		for (char c : str.toCharArray()) {
			if (c != '#') {
				ans.push(c);
			} else if (!ans.isEmpty()) {
			}
		}
		System.out.println("ANS" + ans);
		return ans.toString();
	}

}
