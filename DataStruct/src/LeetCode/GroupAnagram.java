package LeetCode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Given an array of strings strs, group the anagrams together.
 * You can return the answer in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * <p>
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * <p>
 * Explanation:
 * <p>
 * There is no string in strs that can be rearranged to form "bat".
 * The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
 * The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
 * Example 2:
 * <p>
 * Input: strs = [""]
 * <p>
 * Output: [[""]]
 * <p>
 * Example 3:
 * <p>
 * Input: strs = ["a"]
 * <p>
 * Output: [["a"]]
 */
public class GroupAnagram {
    public static void main(String[] args) {
        groupAnagramsJava8(new String[]{""});
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hMap = new HashMap<>();
        for (String s : strs) {
            System.out.println("INput:: " + s);
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            System.out.println("Out:: " + s);

            if (!hMap.containsKey(key)) {
                hMap.put(key, new ArrayList<>());
            }
            hMap.get(key).add(s);
        }
        System.out.println(hMap.values());
        return null;
    }

    public static void groupAnagramsJava8(String[] strs) {
        Stream inputStream = Arrays.stream(strs);
        Map<String, List<String>> hMap =
                (Map<String, List<String>>) inputStream.collect(Collectors.groupingBy(s -> {
                            char[] ch = ((String) s).toCharArray();
                            Arrays.sort(ch);
                            return new String(ch);
                        }
                ));
        System.out.println(hMap.values());
    }

}
