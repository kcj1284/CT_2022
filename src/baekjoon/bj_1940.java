package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_1940 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int count = 0;
		int str = 0;
		int end = N - 1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		while (str < end) {
			if (arr[str] + arr[end] > M) {
				end--;
			} else if (arr[str] + arr[end] < M) {
				str++;
			} else {
				count++;
				end--;
				str++;
			}
		}
		System.out.println(count);
		br.close();
	}

}
