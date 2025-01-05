package LeetCode;
/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D
 * and M.
 * Symbol       Value
 *  
 *  I             1
 *  V             5
 *	X             10
 *	L             50
 *	C             100
 *	D             500
 * 	M             1000
 *  
 *  For example, 2 is written as II in Roman numeral, just two ones added together. 
 *  12 is written as XII, which is simply X + II. The number 27 is written as XXVII, 
 *  which is XX + V + II.
 *
 */

public class RomanInt {
	public static void main(String[] args) {
		System.out.println(" " + romanToInt("MCD"));
	}

	private static int translate(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}

	public static int romanToInt(String s) {
		int c = translate(s.charAt(0));
		System.out.println("Curr " + c); 
		int sum = 0;
		for (int i = 1; i < s.length(); i++) {
			int next = translate(s.charAt(i));
			System.out.println("Nxt " + next);
			if (c < next) {
				sum -= c;
			} else {
				sum += c;
			}
			System.out.println("Sum " + sum);
			c = next;
		}
		sum += c;
		return sum;
	}
}