package LeetCode.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;


/**
 * Given an integer array nums, move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 * <p>
 * Input: nums = [0]
 * Output: [0]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int[] out = moveZeroes(nums);
        moveZeroesUsingJava8(nums);
        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i] + " ");
        }
    }

    /**
     * Leetcode
     *
     * @param nums
     * @return
     */
    public static int[] moveZeroes(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[idx] = nums[i];
                idx++;
            }
        }

        for (int i = idx; i < nums.length; i++) {
            nums[i] = 0;
        }

        // System.out.println(right);
        return nums;
    }

    /**
     * Using Java 8
     *
     * @param nums
     */
    public static void moveZeroesUsingJava8(int[] nums) {

        int[] strInt = IntStream.of(nums).boxed().
                sorted(Comparator.comparing(n -> n == 0)).
                mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(strInt));

    }

}
