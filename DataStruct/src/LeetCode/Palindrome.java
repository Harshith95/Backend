package LeetCode;
/**
 * Given an integer x, return true if x is a palindrome , and false otherwise.
 * 
 * Example 1:
 * 
 * Input: x = 121 Output: true Explanation: 121 reads as 121 from left to right
 * and from right to left. Example 2:
 * 
 * Input: x = -121 Output: false Explanation: From left to right, it reads -121.
 * From right to left, it becomes 121-. Therefore it is not a palindrome.
 * 
 * 
 * 
 * Example 3:
 * 
 * Input: x = 10 Output: false Explanation: Reads 01 from right to left.
 * Therefore it is not a palindrome.
 *
 */

public class Palindrome {
	public static void main(String[] args) {
		int x = 1881;
		boolean isFlag = isPalindrome(x);
		System.err.println(isFlag);
	}

	public static boolean isPalindrome(int x) {
		int temp = x;
		int rev = 0;
		while (x > 0) {
			int digit = x % 10;
			rev = (rev * 10) + digit;
			x = x / 10;
		}
		return temp == rev;

	}

	public static boolean isPalindromeTwoPoint(int x) {
		int i = 0;
		int j = String.valueOf(x).length() - 1;

		// System.err.println(String.valueOf(x).charAt(3));
		while (i < j) {
			System.err.println(i + "+" + j);
			if (String.valueOf(x).charAt(i) != String.valueOf(x).charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}
}
