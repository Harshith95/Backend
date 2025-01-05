package LeetCode;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets. Open brackets must
 * be closed in the correct order. Every close bracket has a corresponding open
 * bracket of the same type.
 *
 */

public class ValidParenthesis {
	public static void main(String[] args) {
		// isValid("()[]{}");
		System.out.println(isValid("({)}"));
	}

	public static boolean isValid(String s) {
		if (s.length() % 2 != 0) {
			return false;
		}

		Stack<Character> st = new Stack<>();
		for (char c : s.toCharArray()) {
			switch (c) {
			case '(':
			case '{':
			case '[':
				st.push(c);
				break;
			case ')':
				if (st.isEmpty() || st.pop() != '(') {
					return false;
				}
				break;
			case '}':
				if (st.isEmpty() || st.pop() != '{') {
					return false;
				}
				break;
			case ']':
				if (st.isEmpty() || st.pop() != '[') {
					return false;
				}
				break;
			default:
				return false;
			}

		}
		System.out.println(st.size());
		return st.isEmpty();
	}
}
