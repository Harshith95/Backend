package java8;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 9. Partition Numbers into Even and Odd
 * Input:
 * [1, 2, 3, 4, 5, 6]
 * Expected Output:
 * {true=[2, 4, 6], false=[1, 3, 5]}
 */
public class PartitionEvenOddFromListJ8 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6);
//        Map<Boolean, List<Integer>> mapIN = intList.stream()
//                .collect(Collectors.partitioningBy(
//                n -> n % 2 == 0
//        ));


        Map<Boolean, List<Integer>> mapIN = intList.stream()
                .collect(Collectors.partitioningBy(
                        n -> n % 2 == 0
                ));

        System.out.println("Out::" + mapIN);
    }
}
