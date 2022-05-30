package swea;

import java.util.Scanner;
import java.io.FileInputStream;

class swea_1204_frequency {
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("res/1204.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int tryed = sc.nextInt();
			int student[] = new int[101];
			int max = 0, max_ind = 0;
			for (int i = 0; i < 1000; i++) {
				int temp = sc.nextInt();
				student[temp] = student[temp] + 1;
			}
			for (int i = 0; i < 101; i++) {
				if (max <= student[i]) {
					max = student[i];
					max_ind = i;
				}
			}

			System.out.printf("#%d %d%n", test_case, max_ind);
		}
		sc.close();

	}
}
