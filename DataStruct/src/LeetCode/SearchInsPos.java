package LeetCode;

/**
 * Given a sorted array of distinct integers and a target value, return the
 * index if the target is found. If not, return the index where it would be if
 * it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,3,5,6], target = 5 Output: 2
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,3,5,6], target = 2 Output: 1
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [1,3,5,6], target = 7 Output: 4
 */

public class SearchInsPos {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 4;
        int i = searchInsertLogN(nums, target);
        System.out.println(i);
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
