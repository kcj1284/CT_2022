package swea;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

class swea_1984_reverage {
	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("res/1984.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			int rev = 0;
			int arr[] = new int[10];

			for (int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			for (int i = 1; i < 9; i++) {
				rev = rev + arr[i];
			}
			int temp = rev * 10;
			temp = temp / 8;
			if (temp % 10 > 4)
				rev = rev / 8 + 1;
			else
				rev = rev / 8;

			System.out.println("#" + test_case + " " + rev);
		}
	}
}