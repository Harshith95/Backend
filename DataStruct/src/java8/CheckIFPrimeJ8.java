package java8;

import java.util.stream.IntStream;

/**
 * 8. Check if Number is Prime
 * Input:
 * 17
 * Expected Output:
 * true
 */
public class CheckIFPrimeJ8 {
    public static void main(String[] args) {
        int input = 11;
        if (input <= 1) {
            System.out.print("False");
        } else {
           boolean flag = IntStream.rangeClosed(
                    2, (int) Math.sqrt(input))
                    .noneMatch(i -> input % i == 0);
            System.out.print(flag);
        }
    }
}
