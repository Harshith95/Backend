package LeetCode.easy;

/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["flower","flow","flight"] Output: "fl" Example 2:
 * <p>
 * Input: strs = ["dog","racecar","car"] Output: "" Explanation: There is no
 * common prefix among the input strings.
 */

public class longComPref {
    public static void main(String[] args) {
        String[] str = new String[]{"flower", "flow", "fl"};
        String res = longestCommonPrefix(str);
        System.out.println(res);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String source = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String searchStr = strs[i];
            while (searchStr.indexOf(source) != 0) {
                source = source.substring(0, source.length() - 1);
            }
        }
        return source;
    }
}
