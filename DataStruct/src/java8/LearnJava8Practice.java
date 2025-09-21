package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LearnJava8Practice {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        List<Integer> lis = Arrays.stream(arr).boxed().toList();
        Map<Boolean, List<Integer>> inMap =
        lis.stream().collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println(inMap);
        lis.stream().forEach(System.out::println);
    }

}
