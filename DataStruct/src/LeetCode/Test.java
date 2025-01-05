package LeetCode;

public class Test {

	public static void main(String[] args) {
		
		int x =5;
		int y=x++;
		int z = ++y;
		System.out.println(z);
	}

	/*
	 * public static boolean containsDuplicate(int[] nums) {
	 * 
	 * Arrays.sort(nums); int length = nums.length; for (int i = 0; i < length; i++)
	 * { System.out.print(" " + nums[i]); }
	 * 
	 * for (int i = 0; i < length; i++) { if (nums[i] == nums[i + 1]) { return
	 * false; } } return true; }
	 * 
	 * }
	 * 
	 * static int getMethod() { Map<Integer, Integer> frequencMap = new HashMap<>();
	 * for (int id : ids) { frequencMap.put(id, frequencMap.getOrDefault(id, 0) +
	 * 1); }
	 * 
	 * List<Integer> frequencies = new ArrayList<>(frequencMap.values());
	 * Collections.sort(frequencies);
	 * 
	 * int typeRemaining = frequencies.size(); for (int frequency : frequencies) {
	 * if (m >= frequency) { m -= frequency; typeRemaining--; } else { break; } }
	 * 
	 * return typeRemaining; }
	 */
}
