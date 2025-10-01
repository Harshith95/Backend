package LeetCode.easy;

public class ReverseStr {
	public static void main(String[] args) {
		char[] c = { 'h', 'e', 'l', 'l', 'o' };
		reverseString(c);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " :: ");
		}
	}

	public static void reverseString(char[] s) {
		int i = 0;
		int j = s.length - 1;
		while (i < j) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
	}
}
