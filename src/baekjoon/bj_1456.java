package baekjoon;

import java.util.Scanner;

public class bj_1456 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		int b_sqrt = (int) Math.sqrt(b);
		int cnt = 0;
		int pri = 0;
		boolean[] arr = new boolean[b_sqrt * b_sqrt];
		arr[0] = arr[1] = true;
		for (int i = 2; i <= b_sqrt; i++) {
			if (arr[i])
				continue;
			for (int j = i * 2; j < b_sqrt; j += i) {
				arr[j] = true;
			}
		}

		for (long i = a; i <= b_sqrt; i++) {
			long temp = i;
			while (temp < b) {
				temp = temp * i;
//				arr[temp] = false;
			}
		}
		sc.close();
	}
}