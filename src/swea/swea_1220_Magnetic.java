package swea;

import java.util.Scanner;
import java.io.FileInputStream;

class swea_1220_Magnetic {
	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("res/1220.txt"));

		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
			int T = sc.nextInt();
			int[][] arr = new int[T][T];
			int count = 0;
			for (int i = 0; i < T; i++) {
				for (int j = 0; j < T; j++) {
					arr[j][i] = sc.nextInt();
				}
			}

			for (int i = 0; i < T; i++) {
				boolean t = false;
				for (int j = 0; j < T; j++) {
					if (arr[i][j] == 1) {
						t = true;
					}
					if (t && arr[i][j] == 2) {
						count++;
						t = false;
					}
				}
			}

			System.out.printf("#%d %d%n", test_case, count);
		}
	}
}