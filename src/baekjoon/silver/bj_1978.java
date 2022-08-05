package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1978 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int count = n;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] == 1||arr[i] == 4)
				count--;
		}

		for (int num : arr) {
			for (int p = 2; p < num / 2; p++) {
				if (num % p == 0) {
					count--;
					break;
				}
			}
		}
		System.out.println(count);
	}
}