package LeetCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * You are given an array prices where prices[i] is the price of a given stock
 * on the ith day.
 * 
 * You want to maximize your profit by choosing a single day to buy one stock
 * and choosing a different day in the future to sell that stock.
 * 
 * Return the maximum profit you can achieve from this transaction. If you
 * cannot achieve any profit, return 0.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: prices = [7,1,5,3,6,4]
 * 
 * Output: 5 Explanation: Buy on day 2 (price = 1) and sell on day 5 (price =
 * 6), profit = 6-1 = 5. Note that buying on day 2 and selling on day 1 is not
 * allowed because you must buy before you sell.
 * 
 * 
 * Example 2:
 * 
 * Input: prices = [7,6,4,3,1]
 * 
 * 
 * Output: 0 Explanation: In this case, no transactions are done and the max
 * profit = 0.
 * 
 * 
 *
 */

public class BestTimeToBuyAndSellStock {
	public static void main(String[] args) {
		int[] inpArr = { 7, 1, 5, 3, 6, 4 };
		// int res = maxProfit(inpArr);
		int res = maxProfit(inpArr);
		//System.out.println(maxProfitJava8(inpArr));
		System.out.println(res);
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

	/**
	 * Using Java 8 find minimum value in array
	 */

	public static void maxProfitJava8(int[] prices) {
		// create a list of integers
		List<Integer> number = Arrays.asList(2, 3, 4, 5, 6);

		// demonstration of map method
		List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
		int ev = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
		
		System.out.println("Now" + ev);
		square.forEach(System.out::println);
	}

}
