package swea;

import java.io.FileInputStream;
import java.util.Scanner;

class swea_2005_Pascal {
	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("res/2005.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int arr[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					if (i == 0 || j == 0)
						arr[i][j] = 1;
					if ((i - 1) < 0 || (j - 1) < 0)
						arr[i][j] = 1;
					else
						arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
			}
			System.out.println("#" + test_case);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (arr[i][j] > 0)
						System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}