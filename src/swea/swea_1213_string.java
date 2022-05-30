package swea;

import java.io.FileInputStream;
import java.util.Scanner;

class swea_1213_string {
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("res/1213.txt"));
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int t = sc.nextInt();
			int result = 0;

			String a = sc.next();
			String b = sc.next();

			int count = -1;
			while ((count = b.indexOf(a, count + 1)) >= 0)
				result++;

			System.out.printf("#%d %d%n", t, result);
		}
	}
}