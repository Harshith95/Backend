package LeetCode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers {@code nums} and an integer {@code target},
 * returns the indices of the two numbers such that they add up to {@code target}.
 * <p>
 * You may assume that each input has exactly one solution, and you may not
 * use the same element twice.
 * <p>
 * The answer can be returned in any order.
 *
 * <h3>Example:</h3>
 * <pre>
 * Input:  nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * </pre>
 *
 * @param nums   the input array of integers
 * @param target the target sum
 * @return the indices of the two numbers that add up to the target
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4};
        int res[] = twoSum(arr, 7);
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

                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
}
