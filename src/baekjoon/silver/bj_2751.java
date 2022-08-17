package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_2751 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int len = Integer.valueOf(st.nextToken());
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(arr);
		for (int i : arr)
			sb.append(i + "\n");
		System.out.println(sb);
	}
}