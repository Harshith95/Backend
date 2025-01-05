package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because
 * nums[0] + nums[1] == 9, we return [0, 1].
 *
 * 
 */

public class TwoSum {
	public static void main(String[] args) {
		int[] arr = { 3, 3, 4 };
		int[] arr1 = new int[2];
		int res[] = twoSum(arr, 7);
//		int target = 5;
//		for (int i = 0; i < arr.length; i++) {
//			int rem = target - arr[i];
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[j] == rem) {
//					arr1[0] = i;
//					arr1[1] = j;
//				}
//			}
//
//		}
//
		for (int i = 0; i < res.length; i++) {
			System.out.print(" " + res[i]);
		}

	}

	/**
	 * LeetCode: there is one problem it will not give you the first occurence for
	 * example : 3,3,4 : target : 7
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			int complement = target - nums[i];
			if (numMap.containsKey(complement)) {
				return new int[] { numMap.get(complement), i };
			}
			numMap.put(nums[i], i);
		}

		return new int[] {}; // No solution found
	}
}
