package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj_1427 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String num = br.readLine();
		char[] nums = num.toCharArray();
		int len = nums.length;
		int[] number = new int[len];
		for (int i = 0; i < len; i++) {
			number[i] = nums[i] - '0';
		}
		Arrays.sort(number);

		for (int i = len - 1; i >= 0; i--)
			sb.append(number[i]);
		System.out.println(sb);
	}

}
