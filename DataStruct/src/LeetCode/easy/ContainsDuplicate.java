package LeetCode.easy;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Given an integer array nums and an integer k, return true if there are two
 * distinct indices i and j in the array such that nums[i] == nums[j] and
 * <p>
 * abs(i - j) <= k.
 * <p>
 * <p>
 * The k parameter sets the maximum allowed distance between two equal elements in the array.
 * <p>
 * ✅ k is NOT for checking if duplicates exist in general — it's for checking if duplicates exist close together (within k indices).
 * <p>
 * Example 1: Input: nums = [1,2,3,1], k = 3 Output: true
 * <p>
 * Example 2: Input: nums = [1,0,1,1], k = 1 Output: true
 * <p>
 * Example 3: Input: nums = [1,2,3,1,2,3], k = 2 Output: false
 */

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {9, 8, 9, 5, 4};
        int k = 2;
        boolean isFlag = containsNearbyDuplicate(nums, k);
        System.out.println(isFlag);
    }

    /**
     * k is the window length
     * {1, 2, 3, 4, 1}
     *
     * @param nums
     * @param k
     * @return
     */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (i > k) {
                System.out.println("i::" + i + " :: k " + k);
                hashSet.remove(nums[i - k - 1]);
            }
            System.out.println("Hash::" + hashSet);
            if (!hashSet.add(nums[i])) {
                return true;
            }
        }

        return false;
    }

    /**
     * Time Limit Exceeded
     *
     * @param nums
     * @param k
     * @return
     */
    public static boolean containsNearbyDuplicateMine(int[] nums, int k) {
        ArrayList<Integer> aList = new ArrayList<>();
        int comp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (aList.contains(nums[i])) {
                int prevInd = aList.lastIndexOf(nums[i]);
                comp = i - prevInd;
                if (comp <= k) {
                    return true;
                }
            }
            aList.add(nums[i]);
        }
        return false;
    }

}
