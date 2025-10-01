package LeetCode.easy;

/**
 * Given a string s consisting of words and spaces, return the length of the
 * last word in the string.
 * 
 * A word is a maximal substring consisting of non-space characters only.
 *
 * Example 1:
 * 
 * Input: s = "Hello World"
 * 
 * Output: 5 Explanation: The last word is "World" with length 5.
 * 
 * Example 2:
 * 
 * Input: s = " fly me to the moon "
 * 
 * Output: 4 Explanation: The last word is "moon" with length 4.
 * 
 * Example 3:
 * 
 * Input: s = "luffy is still joyboy"
 * 
 * Output: 6 Explanation: The last word is "joyboy" with length 6.
 *
 */
public class LenOfLastWord {
	public static void main(String[] args) {
		String s = "Hello World";
		s = " fly me to the moon ";
		int len = lengthOfLastWord(s);
		System.out.println(len);
	}

	/**
	 * My code
	 * 
	 * @param s
	 * @return
	 */
	public static int lengthOfLastWord(String s) {

		s = s.trim();
		int ind = s.lastIndexOf(' ');
		s = s.substring(ind + 1, s.length());
		System.out.println("Value is:" + s + s.length() + "Test");

		return s.length();
	}

	/**
	 * LeetCode
	 * 
	 * @param s
	 * @return
	 */
	public static int lengthOfLastWordSub(String s) {
		int count = 0;
		int j = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(s.length() - 1 - j) == ' ') {
				j++;
				continue;
			} else {
				if (s.charAt(i) != ' ') {
					count++;
				} else {
					break;
				}
			}
		}
		return count;
	}
}
