package baekjoon;

import java.util.Scanner;

public class bj_1717 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n + 1][n + 1];
		boolean T = true;

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				arr[i][j] = 1234567;
			}
		}

		for (int i = 0; i <= n; i++) {
			arr[i][0] = i;
		}

		for (int i = 0; i < m; i++) {
			int ck = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (ck == 0) {
				for (int j = 0; j <= n; j++) {
					if (arr[a][j] == 1234567)
						arr[a][j] = b;
					if (arr[b][j] == 1234567)
						arr[b][j] = a;
				}

			}
			if (ck == 1) {
				for (int j = 0; j <= n; j++) {
					if (arr[a][j] == b) {
						System.out.println("YES");
						T = false;
					}

				}
				if (T)
					System.out.println("NO");
			}
		}

	}
}
