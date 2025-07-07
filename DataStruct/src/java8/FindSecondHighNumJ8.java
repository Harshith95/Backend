package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * 11. Find Second Highest Number
 * Input:
 * [3, 5, 1, 9, 7]
 * Expected Output:
 * 7
 */
public class FindSecondHighNumJ8 {
    public static void main(String[] args) {
        List<Integer> inList = Arrays.asList(3, 5, 1, 9, 7);
        Stream<Integer> inStr = inList.stream().sorted(Comparator.reverseOrder());
//        inStr.forEach(System.out::print);
        Optional<Integer> optInt = inStr.skip(1).findFirst();
        System.out.print(optInt.get());

    }
}
