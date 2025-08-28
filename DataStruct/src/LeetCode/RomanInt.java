package LeetCode;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D
 * and M.
 * Symbol       Value
 * <p>
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * <p>
 * For example, 2 is written as II in Roman numeral, just two ones added together.
 * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII,
 * which is XX + V + II.
 *
 */

public class RomanInt {
    public static void main(String[] args) {
        System.out.println(" " + romanToInt("MCD"));
    }

    private static int translate(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static int romanToInt(String s) {
        int c = translate(s.charAt(0));
        int sum = 0;
        for (int i = 1; i < s.length(); i++) {
            int next = translate(s.charAt(i));
            System.out.println("Curr " + c + " :::" + "Nxt " + next);
            if (c < next) {
                sum -= c;
            } else {
                sum += c;
            }
            System.out.println("Sum " + sum);
            c = next;
        }
        sum += c;
        return sum;
    }
}