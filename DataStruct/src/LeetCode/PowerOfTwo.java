package LeetCode;

public class PowerOfTwo {
	public static void main(String[] args) {
		boolean isFlag = isPowerOfTwo(16);
		System.out.println(isFlag);
	}

	/**
	 * LeetCode if n = 16 in bit its represneted as 1     0    0    0     0
	 * 													2^4	  2^3  2^2	2^1	 2^0
	 * now n-1 is 0 1 1 1 1
	 * if we use & operation then we get the result as 0 0 0 0 0
	 * @param n
	 * @return
	 */
	private static boolean isPowerOfTwo(int n) {
		if (n == 0) {
			return false;
		}
		return (n & (n - 1)) == 0;

	}

	public static boolean isPowerOfTwomine(int n) {
		int x = 0;
		double res = 0;
		while (res <= n) {
			res = Math.pow(2, x);
			if (res == n) {
				break;
			}
			x++;
		}
		// System.out.println(res);

		return res == n;
	}

}
/**
 * Given an integer n, return true if it is a power of two. Otherwise, return
 * false.
 * 
 * An integer n is a power of two, if there exists an integer x such that n ==
 * 2x.
 * 
 * 
 * 
 * Example 1: Input: n = 1 Output: true Explanation: 20 = 1
 * 
 * Example 2: Input: n = 16 Output: true Explanation: 24 = 16
 * 
 * Example 3: Input: n = 3 Output: false
 *
 *
 */