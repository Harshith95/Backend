package java8;

import java.util.Arrays;
import java.util.List;

/**
 * Get Unique Characters from List of Words
 * Input:
 * ["java", "python"]
 * Expected Output:
 * ['j', 'a', 'v', 'p', 'y', 't', 'h', 'o', 'n'] (in any consistent order)
 */
public class UniqueCharFromListJ8 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "python");
        List<Character> charList = words.stream()
                .flatMap(word -> word.chars()
                        .mapToObj(c -> (char) c))
                .distinct().toList();
        System.out.println(charList);
    }
}
