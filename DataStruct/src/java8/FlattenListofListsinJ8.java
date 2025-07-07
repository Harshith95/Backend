package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 13. Flatten a List of Lists
 * Input:
 * [[1, 2], [3, 4], [5]]
 * Expected Output:
 * [1, 2, 3, 4, 5]
 */
public class FlattenListofListsinJ8 {

    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                List.of(5)
        );
        List<Integer> flattened = listOfLists.stream()
                .flatMap(List::stream).collect(Collectors.toList());
        System.out.print(flattened);
    }
}
