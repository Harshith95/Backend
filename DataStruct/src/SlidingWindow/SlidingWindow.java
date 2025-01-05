package SlidingWindow;

public class SlidingWindow {
	// find the longest subarray with a sum less than or equal to k

	public static void main(String[] args) {
		int[] nums = { 3, 1, 2, 7, 4, 2, 1, 1, 5 };
		int k = 8;
		int left = 0, ans = 0, curr = 0;
		for (int right = 0; right < nums.length; right++) {
			curr += nums[right];
			System.out
					.println("Value in nums when Right index is " + right + "::" + nums[right] + ": Current: " + curr);
			while (curr > k) {
				System.out.println("Target is " + k + ": Current: " + curr);
				curr -= nums[left];
				left++;
			}
			System.out.println("Right ::" + right + ": Left :" + left + ": Ans :" + ans);
			ans = Math.max(ans, right - left + 1);

		}
	}
}
