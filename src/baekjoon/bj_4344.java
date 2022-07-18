package baekjoon;

import java.util.Scanner;

public class bj_4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		for (int i = 0; i < C; i++) {
			int N = sc.nextInt();
			float suma = 0;
			int count = 0;
			int[] arr = new int[N];
			for (int j = 0; j < N; j++) {
				arr[j] = sc.nextInt();
				suma += arr[j];
			}

			suma = suma / N;
			for (int j = 0; j < N; j++) {
				if (arr[j] > suma)
					count++;
			}

			float result = (float) count / (float) N * 100;
			System.out.printf("%.3f" + "%c\n", result, '%');
		}
		sc.close();
	}
}