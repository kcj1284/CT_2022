package swea;

import java.io.FileInputStream;
import java.util.Scanner;

class swea_1217_power {
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("res/1217.txt"));
		
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int test_case = 1; test_case <= T; test_case++) {
			int t = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.printf("#%d %d\n", t, abs(a, b));
		}
	}

	public static int abs(int a, int b) {
		if (b<=0)
			return 1;
		else
			return a * abs(a, b-1);
	}
}