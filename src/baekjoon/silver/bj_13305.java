package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_13305 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		long[] city = new long[t];
		long[] gas = new long[t];
		int str = 0;
		int end = 0;
		long answer = 0;

		st = new StringTokenizer(br.readLine());
		city[0] = 0;
		for (int i = 1; i < t; i++) {
			city[i] = city[i - 1] + Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < t; i++) {
			gas[i] = Integer.parseInt(st.nextToken());
		}
		gas[t - 1] = 0;
		for (int i = 0; i < t; i++) {
			end = i;
			if (gas[str] <= gas[i]) {
				continue;
			}
			answer += (city[end] - city[str]) * gas[str];
			str = i;
		}
		System.out.println(answer);
	}
}