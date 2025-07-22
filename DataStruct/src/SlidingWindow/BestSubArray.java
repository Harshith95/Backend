package SlidingWindow;

public class BestSubArray {
	public static void main(String[] args) {
		int[] nums = { 2, 1, 5, 1, 3, 2 };
		int k = 3;
		int j = findBestSubarray(nums, k);
		System.out.println("Best Sum array" + j);

	}

	private static int findBestSubarray(int[] nums, int k) {
		int curr = 0;
		for (int i = 0; i < k; i++) {
			curr += nums[i];
		}

		int ans = curr;
		for (int i = k; i < nums.length; i++) {
			System.out.println("Current:: " + curr + "  nums[i]:: " + nums[i] + " (i-k) :::" + (i - k) + "  nums[i-k]:: "
					+ nums[i - k]);
			curr = curr + nums[i] - nums[i - k];
			System.out.println("Value is " + curr);
			ans = Math.max(ans, curr);
		}

		return ans;
	}
}
