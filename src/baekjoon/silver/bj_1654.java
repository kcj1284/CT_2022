package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1654 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 4
		int m = Integer.parseInt(st.nextToken()); // 11
		long str = 1;
		long end = Integer.MAX_VALUE;
		long mid = Integer.MAX_VALUE;
		int count = n;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		while (str <= end) {
			count = 0;
			for (int i = 0; i < n; i++) {
				count += (arr[i] / mid);
			}
			if (count >= m) {
				str = mid + 1;
			} else if (count < m) {
				end = mid - 1;
			}
			mid = (str + end) / 2;
		}
		System.out.println(mid);
	}
}
