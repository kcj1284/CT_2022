package baekjoon;

import java.util.Scanner;

public class bj_1456 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		int count = 0;
		int[] pri = new int[10000001];
		for (int i = 2; i <= 10000000; i++) {
			pri[i] = i;
		}
		for (int i = 2; i <= 10000000; i++) {
			if (pri[i] == 0)
				continue;
			for (int j = i * 2; j <= 10000000; j += i) {
				pri[j] = 0;
			}
		}
		for (int i = 2; i <= 10000000; i++) {
			if (pri[i] == 0)
				continue;
			long temp = pri[i] * pri[i];

			while (temp < a) {
				temp *= pri[i];
			}

			while (temp <= b) {
				count++;
				temp *= pri[i];
			}
		}
		System.out.println(count);
		sc.close();
	}
}