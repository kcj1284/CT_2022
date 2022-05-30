package swea;

import java.io.FileInputStream;
import java.util.Scanner;

class swea_14178_garden {
	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("res/14178.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int gar = sc.nextInt();
			int wat = sc.nextInt() * 2 + 1;
			int ans = gar / wat;
			if (gar % wat != 0) {
				ans += 1;
			}
			System.out.println("#" + test_case + " " + ans);
		}
	}
}