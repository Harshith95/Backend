package LeetCode;

/**
 * Given a sorted array of distinct integers and a target value, return the
 * index if the target is found. If not, return the index where it would be if
 * it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,3,5,6], target = 5 Output: 2
 * 
 * Example 2:
 * 
 * Input: nums = [1,3,5,6], target = 2 Output: 1
 * 
 * Example 3:
 * 
 * Input: nums = [1,3,5,6], target = 7 Output: 4
 *
 */

public class SearchInsPos {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		int target = 7;
		int i = searchInsertLogN(nums, target);
		System.out.println(i);
	}

	public static int searchInsert(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			} else if (target < nums[i]) {
				return i;
			}
		}
		return nums.length;
	}

	public static int searchInsertLogN(int[] nums, int target) {
		int startInd = 0;
		int endInd = nums.length - 1;
		while (startInd <= endInd) {
			int mid = (startInd + endInd) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				endInd = mid - 1;
			} else if (nums[mid] < target) {
				startInd = mid + 1;
			}
		}
		return startInd;
	}
}
