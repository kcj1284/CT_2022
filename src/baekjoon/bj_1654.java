package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1654 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int str = 0;
		int end = 0;
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (end < arr[i])
				end = arr[i];
		}
		while (str <= end) {
			int mid = (str + end) / 2;
			long sum = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i] > mid)
					sum = sum + arr[i] - mid;
			}
			if (sum >= m)
				str = mid + 1;
			else
				end = mid - 1;
		}
		System.out.println(end);
	}
}
