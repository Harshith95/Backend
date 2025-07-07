package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 10. Convert List of Strings to Uppercase and Join with Commas
 * Input:
 * ["apple", "banana", "cherry"]
 * Expected Output:
 * "APPLE, BANANA, CHERRY"
 */
public class MergeStrToUpperCaseListJ8 {
    public static void main(String[] args) {
        List<String> arrList = Arrays.asList("apple", "banana", "cherry");

        String ans = arrList.stream().
                map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println("Res :: " + ans);

    }

}
