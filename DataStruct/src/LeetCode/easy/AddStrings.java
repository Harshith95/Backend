package LeetCode.easy;

import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Locale;

public class AddStrings {

    public static void main(String[] args) {
        System.out.println(addStrings("1,234,567,890,123,456", "987,654,321,876,544"));
    }

    /**
     * Using Library approach
     *
     * @param num1
     * @param num2
     * @return
     */
    public static String addStrings(String num1, String num2) {
        BigInteger nm1 = new BigInteger(num1.replaceAll(",", ""));
        BigInteger nm2 = new BigInteger(num2.replaceAll(",", ""));
        System.out.println(nm1);
        System.out.println(nm2);
        BigInteger res = nm1.add(nm2);
        String ans = NumberFormat.getInstance(Locale.US).format(res);
        return ans;
    }

}
