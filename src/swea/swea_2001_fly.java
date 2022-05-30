package swea;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

class swea_2001_fly {
	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("res/2001.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][n];
			int ans = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < n - m + 1; i++) {
				for (int j = 0; j < n - m + 1; j++) {
					int count = 0;
					for (int k = 0; k < m; k++) {
						for (int l = 0; l < m; l++) {
							count = count + arr[i + k][j + l];
						}
					}
					if (ans < count)
						ans = count;
				}
			}
			System.out.println("#" + test_case + " " + ans);
		}
	}
}