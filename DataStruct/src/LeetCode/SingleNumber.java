package LeetCode;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Given a non-empty array of integers nums, every element appears twice except
 * for one. Find that single one.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only
 * constant extra space.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,2,1] Output: 1
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [4,1,2,1,2] Output: 4
 * <p>
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [1] Output: 1
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int ans = singleNumber(nums);
        System.out.println("Ans" + ans);
    }

    /**
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
     * input {4, 1, 2, 1, 2}
     *
     * @param nums
     * @return Core Idea: XOR Bitwise Operator (^)
     * ^ is the bitwise XOR operator.
     * <p>
     * It has some useful properties:
     * <p>
     * a ^ a = 0 → a number XOR'd with itself cancels out.
     * <p>
     * a ^ 0 = a → a number XOR'd with 0 stays the same.
     * <p>
     * XOR is commutative and associative: the order doesn't matter.
     * <p>
     * So if every number appears twice except one, XOR-ing all numbers
     * will cancel out the ones that appear twice, and only the unique number
     * will remain.
     */
    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Input ::" + nums[i]);
            res ^= nums[i];
            System.out.println("XOR ::" + res);
        }
        return res;
    }

}
