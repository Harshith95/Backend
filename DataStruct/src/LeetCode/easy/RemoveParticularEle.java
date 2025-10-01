package LeetCode.easy;

public class RemoveParticularEle {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int res = removeElement(nums, 1);
        for (int i = 0; i < res; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}
