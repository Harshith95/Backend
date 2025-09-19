package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given a list of words, count how many times each word appears using Java 8 features
 * <p>
 * input : List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
 * <p>
 * output: {apple=3, banana=2, orange=1}
 */

/**
 * The code snippet you provided is a Java Stream API operation that groups elements of a stream
 * by their identity and counts their occurrences. Here's a breakdown of what it does:
 * <p>
 * Explanation:
 * words.stream(): Converts the words collection (likely a List or Set) into a stream for processing.
 * Collectors.groupingBy(Function.identity(), Collectors.counting()):
 * Function.identity(): Uses the elements themselves as the key for grouping.
 * Collectors.counting(): Counts the number of occurrences of each element in the group.
 */
public class CountWordFreqJ8 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> wordCount = words.stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(wordCount);
    }
}