package LeetCode;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 *
 * Example 1:
 * 
 * Input: n = 2
 * 
 * Output: 2 Explanation: There are two ways to climb to the top.
 * 
 * 1. 1 step + 1 step
 * 
 * 2. 2 step
 * 
 * Example 2:
 * 
 * Input: n = 3
 * 
 * Output: 3 Explanation: There are three ways to climb to the top.
 * 
 * 1. 1 step + 1 step + 1 step
 * 
 * 2. 1 step + 2 step
 * 
 * 3. 2 steps + 1 step
 * 
 */
public class ClimbStairs {
	public static void main(String[] args) {
		int n = climbStairs(3);
		System.out.println(n);
	}

	public static int climbStairs(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int prev = 1, curr = 1;
		for (int i = 2; i <= n; i++) {
			int temp = curr; // 1 -- 2 -- 3
			curr = prev + curr; // 2 -- 3 -- 5
			prev = temp; // 1 -- 2 -- 3
		}
		return curr;
	}
}
