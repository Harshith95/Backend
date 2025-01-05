package LeetCode;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Given a non-empty array of integers nums, every element appears twice except
 * for one. Find that single one.
 * 
 * You must implement a solution with a linear runtime complexity and use only
 * constant extra space.
 * 
 * Example 1:
 * 
 * Input: nums = [2,2,1] Output: 1
 * 
 * 
 * Example 2:
 * 
 * Input: nums = [4,1,2,1,2] Output: 4
 * 
 * 
 * Example 3:
 * 
 * Input: nums = [1] Output: 1
 *
 */
public class SingleNumber {
	public static void main(String[] args) {
		int[] nums = { 4, 1, 2, 1, 2 };
		int ans = singleNumber(nums);
		System.out.println("Ans" + ans);
	}

	/**
	 * 
	 * @param nums
	 * @return
	 */
	public static int singleNumberMine(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}

		HashSet<Integer> compSet = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			boolean isFlag = compSet.add(nums[i]);
			if (!isFlag) {
				compSet.remove(nums[i]);
				// System.out.println("Duplicate" + nums[i]);
			}
		}

		Iterator<Integer> iter = compSet.iterator();
		while (iter.hasNext()) {
			return iter.next();
		}

		return 0;
	}

	/**
	 * Leet Code solution
	 * 
	 * @param nums
	 * @return
	 */
	public static int singleNumber(int[] nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			res ^= nums[i];
			System.out.println("XOR" + res);
		}
		return res;
	}

}
