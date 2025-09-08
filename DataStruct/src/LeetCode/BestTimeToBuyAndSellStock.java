package LeetCode;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * You are given an array prices where prices[i] is the price of a given stock
 * on the ith day.
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock
 * and choosing a different day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction. If you
 * cannot achieve any profit, return 0.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: prices = [7,1,5,3,6,4]
 * <p>
 * Output: 5 Explanation: Buy on day 2 (price = 1) and sell on day 5 (price =
 * 6), profit = 6-1 = 5. Note that buying on day 2 and selling on day 1 is not
 * allowed because you must buy before you sell.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: prices = [7,6,4,3,1]
 * <p>
 * <p>
 * Output: 0 Explanation: In this case, no transactions are done and the max
 * profit = 0.
 */

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] inpArr = {7, 1, 5, 3, 6, 4};
//        findMinimumfromArr(inpArr);
        int res = 0;
//		res = maxProfitMine(inpArr);
        res = maxProfit(inpArr);
//        res = maxProfitJav8(inpArr);
        System.out.println("Result : " + res);
    }

    /**
     * Test Case failed : 3, 2, 6, 5, 0, 3
     *
     * @param prices
     * @return
     */
    public static int maxProfitMine(int[] prices) {
        int res = 0;
        int temp = prices[0];
        int x = 0;
        for (int i = 1; i < prices.length - 1; i++) {
            if (prices[i] < temp) {
                temp = prices[i];
                x = i;
            }
        }
        for (int j = x + 1; j < prices.length; j++) {
            int tempw = prices[j] - temp;
            if (tempw > res) {
                res = tempw;
            }
        }
        System.out.println(res);
        return res;
    }

    /**
     * { 7, 1, 5, 3, 6, 4 }
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            int curr = prices[i] - min;
            if (curr > max) {
                max = curr;
            }
        }
        return max;
    }


    static void findMinimumfromArr(int[] prices) {
        System.out.println("Input:: " + prices);
        List<Integer> intList = Arrays.stream(prices).boxed().toList();
        intList.forEach(x -> {
            System.out.print(" :: " + x);
        });
        Optional<Integer> min = intList.stream().min(Integer::compareTo);
        System.out.println("\n LOwes " + min.get());
    }


    /**
     * { 7, 1, 5, 3, 6, 4 }
     *
     * @param prices
     * @return
     */
    public static int maxProfitJav8(int[] prices) {
        final int[] min = {Integer.MAX_VALUE}; // Use a single-element array to mimic mutable state

        return IntStream.of(prices)
                .map(price -> {

                    min[0] = Math.min(min[0], price); // Update minimum price seen so far
                    return price - min[0];           // Calculate current profit
                })
                .max()                              // Find the maximum profit
                .orElse(0);                         // Return 0 if prices array is empty
    }


}
