package baekjoon.bronze;

import java.util.Scanner;

public class bj_2775 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int[][] arr = new int[k + 1][n + 1];
			for (int j = 0; j <= n; j++) {
				arr[0][j] = j;
			}
			for (int p = 1; p < k + 1; p++) {
				for (int q = 1; q < n + 1; q++) {
					arr[p][q] = arr[p][q - 1] + arr[p - 1][q];
				}
			}
			System.out.println(arr[k][n]);
		}
	}

}
