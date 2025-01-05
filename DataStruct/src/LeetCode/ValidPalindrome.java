package LeetCode;
/**
 * A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters and removing all non-alphanumeric characters, it reads the
 * same forward and backward. Alphanumeric characters include letters and
 * numbers.
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "A man, a plan, a canal: Panama" Output: true Explanation:
 * "amanaplanacanalpanama" is a palindrome. Example 2:
 * 
 * Input: s = "race a car" Output: false Explanation: "raceacar" is not a
 * palindrome. Example 3:
 * 
 * Input: s = " " Output: true Explanation: s is an empty string "" after
 * removing non-alphanumeric characters. Since an empty string reads the same
 * forward and backward, it is a palindrome.
 *
 */

public class ValidPalindrome {
	public static void main(String[] args) {
		String input = "A man, a plan, a canal: Panama";

		boolean result = isPalindrome(input);
		System.out.println(result);
	}

	public static boolean isPalindrome(String inp) {
		String fixed_Str = "";
		for (char c : inp.toCharArray()) {
			if (Character.isDigit(c) || Character.isLetter(c)) {
				fixed_Str += c;
			}
		}
		fixed_Str = fixed_Str.toLowerCase();
		System.out.println("Output:::" + fixed_Str);
		int fPointer = 0;
		int lPointer = fixed_Str.length() - 1;
		while (fPointer <= lPointer) {
			if (fixed_Str.charAt(fPointer) != fixed_Str.charAt(lPointer)) {
				return false;
			}
			lPointer--;
			fPointer++;
		}
		return true;

	}
}
