package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_11399 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int len = Integer.parseInt(st.nextToken());
		int[] arr = new int[len];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < len; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int answer = arr[0];
		for (int i = 1; i < len; i++) {
			arr[i] += arr[i - 1];
			answer += arr[i];
		}
		System.out.println(answer);
	}

}
