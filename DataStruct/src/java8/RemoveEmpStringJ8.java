package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a list of strings, remove all empty strings and print the result using Java 8.
 * <p>
 * Input:
 * ["apple", "", "banana", " ", "cherry", ""]
 * Expected Output:
 * ["apple", "banana", "cherry"]
 */
public class RemoveEmpStringJ8 {
    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>(
                Arrays.asList("apple", "", "banana", " ", "cherry", ""));
        inputList = inputList.stream()
                .filter(x -> !x.trim().isEmpty()).toList();
        inputList.forEach(System.out::println);

    }
}
