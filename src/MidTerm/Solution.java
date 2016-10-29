package MidTerm;

import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.longestPalindrome("aBebaAabEba");
		s.titleToNumber("AA");
		int[] nums = { 2, 7, 11, 15 };
		s.twoSum(nums, 10);

	}

	/* IV 1) */
	public int longestPalindrome(String s) {

		int max = 0;/* length of longest palindrome */
		String longest = "";
		int length = s.length();

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				int lengthOfTemp = j - i + 1;
				String temp = s.substring(i, j + 1);
				if (isPalindrome(temp)) {
					if (lengthOfTemp > max) {
						longest = temp;
						max = lengthOfTemp;
					}
				}
			}
		}

		return max;
	}

	private boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

	/* 2) */
	public int maxProfit(int[] prices) {
		int profit = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			int diff = prices[i + 1] - prices[i];
			if (diff > 0) {
				profit += diff;
			}
		}
		return profit;
	}

	/* 3) */
	public int titleToNumber(String title) {
		if (title == null || title.length() == 0) {
			System.out.println("Invalid input");
		}
		int result = 0;
		for (int i = 0, t = 0; i < title.length(); i++, t++) {
			char ch = title.charAt(i);
			result = result + (int) Math.pow(26, t) * (ch - 'A' + 1);
		}
		return result;
	}

	/* Bonus */
	public int twoSum(int[] nums, int target) {
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				count++;
			} else {
				map.put(nums[i], i);
			}
		}
		return count;
	}

}
