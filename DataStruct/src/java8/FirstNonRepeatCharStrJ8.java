package java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 5. Find First Non-Repeating Character in a String
 * Input:
 * "swiss"
 * Expected Output:
 * 'w'
 */
public class FirstNonRepeatCharStrJ8 {
    public static void main(String[] args) {
        String input = "swiss";
        Character c = input.chars().mapToObj(x -> (char) x)
                .collect(
                        Collectors.groupingBy(Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println("Output :: " + c);
    }
}
