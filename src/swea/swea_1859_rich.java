package swea;

import java.util.Scanner;
import java.io.FileInputStream;

class swea_1859_rich {
	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("res/1859.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int day = sc.nextInt();
			int price[] = new int[day];
			long count = 0;
			int max = 0;
			for (int i = 1; i <= day; i++) {
				price[day - i] = sc.nextInt();
			}
			for (int i = 0; i < day; i++) {
				if (max < price[i]) {
					max = price[i];
				}
				count = count + (max - price[i]);

			}

			System.out.printf("#%d %d%n", test_case, count);
		}
		sc.close();
	}
}