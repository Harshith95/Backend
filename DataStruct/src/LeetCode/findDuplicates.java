package LeetCode;

public class findDuplicates {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 3, 4, 2, 2 };
        System.out.println(findDuplicatesLeetCode(nums));
	}

	/** Brute Force Method **/
	public static int findDuplicate(int[] nums) {
		long startTime = System.nanoTime();
		System.out.println();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					System.out.println(nums[i]);
				}
			}
		}
		long endTime = System.nanoTime();
		long executionTime = (endTime - startTime) / 1000000;
		System.out.println("Counting to 10000000 takes " + executionTime + " ms");
		return 0;
	}

	public static int findDuplicatesLeetCode(int[] nums) {

		int ans = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == i + 1)
				continue;
			if (nums[nums[i] - 1] == nums[i]) {
				ans = nums[i];
				break;
			} else {
				int temp = nums[nums[i] - 1];
				nums[nums[i] - 1] = nums[i];
				nums[i] = temp;
				i--;
			}
		}
		return ans;
	}
}
