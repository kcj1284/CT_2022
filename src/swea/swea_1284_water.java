package swea;

import java.util.Scanner;
import java.io.FileInputStream;

class swea_1284_water {
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("res/1284.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int p = sc.nextInt(), q = sc.nextInt(), r = sc.nextInt(), s = sc.nextInt(), w = sc.nextInt();
			int a = 0;
			int b = 0;
			a = w * p;
			if (r > w)
				b = q;
			else
				b = q + (w - r) * s;

			System.out.println("#" + test_case + " " + (a <= b ? a : b));
		}
	}
}