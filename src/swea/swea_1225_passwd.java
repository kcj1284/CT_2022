package swea;

import java.util.Scanner;
import java.io.FileInputStream;

class swea_1225_passwd {
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("res/1225.txt"));
		Scanner sc = new Scanner(System.in);
		for (int k = 1; k <= 10; k++) {
			int T;
			T = sc.nextInt();
			int[] arr = new int[8];
			for (int i = 0; i < 8; i++) {
				arr[i] = sc.nextInt();
			}
			boolean t = true;
			while (t) {
				for (int i = 1; i < 6; i++) {
					int temp = arr[0];
					for (int j = 0; j < 7; j++) {
						arr[j] = arr[j + 1];
					}
					if (temp - i <= 0) {
						arr[7] = 0;
						System.out.print("#" + T + " ");
						for (int o = 0; o < 8; o++) {
							System.out.print(arr[o] + " ");
						}
						System.out.println();
						t = false;
						break;
					}
					arr[7] = temp - i;
				}
			}
		}
	}
}