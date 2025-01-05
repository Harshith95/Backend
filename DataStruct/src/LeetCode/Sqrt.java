package LeetCode;

/**
 * Given a non-negative integer x, return the square root of x rounded down to
 * the nearest integer. The returned integer should be non-negative as well.
 * 
 * You must not use any built-in exponent function or operator.
 * 
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 * 
 * 
 * Example 1:
 * 
 * Input: x = 4 Output: 2 Explanation: The square root of 4 is 2, so we return
 * 2.
 * 
 * Example 2:
 * 
 * Input: x = 8 Output: 2 Explanation: The square root of 8 is 2.82842..., and
 * since we round it down to the nearest integer, 2 is returned.
 * 
 * @author 91879
 *
 */
public class Sqrt {
	public static void main(String[] args) {
		// int res = mySqrt(7);
		int res = mySqrtLogN(7);
		System.out.println(res);
	}

	/**
	 * Brute force approach
	 * 
	 * @param x
	 * @return
	 */
	public static int mySqrt(int x) {
		for (int i = 0; i < x; i++) {
			if (i * i == x) {
				return i;
			}

		}
		return 0;
	}

	/**
	 * Log N: Binary search approach
	 * 
	 * @param x
	 * @return
	 */
	public static int mySqrtLogN(int x) {

		int left = 0;
		int right = x;
		int ans = 0;
		while (left <= right) {
			int mid = (left + right) / 2;
			if ((mid * mid) < x) {
				left = mid + 1;
				ans = mid;
			} else if ((mid * mid) > x) {
				right = mid - 1;
			} else if ((mid * mid) == x) {
				return mid;
			}
		}

		return ans;
	}

	public int mySqrtLogN1(int x) {
		int l = 1;
		int r = x;
		while (l <= r) {
			int m = (r - l) / 2 + l;
			if (m > x / m)
				r = m - 1;
			else if (m < x / m)
				l = m + 1;
			else
				return m;
		}
		return r;
	}

}
