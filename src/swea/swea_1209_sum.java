package swea;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

class swea_1209_sum {
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("res/1209.txt"));
		Scanner sc = new Scanner(System.in);
		for (int k = 1; k <= 10; k++) {
			int T;
			T = sc.nextInt();

			int arr[][] = new int[100][100];
			int[] max_row = new int[100];
			int[] max_height = new int[100];
			int max_x = 0;
			int max_y = 0;
			int max = 0;
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
					max_row[i] += arr[i][j];
				}
			}
			Arrays.sort(max_row);
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					max_height[i] += arr[j][i];
				}
			}
			Arrays.sort(max_height);
			for (int i = 0; i < 100; i++) {
				max_x += arr[i][i];
				max_y += arr[i][99 - i];
			}
			max = max_row[99] > max_height[99] ? max_row[99] : max_height[99];
			max = max > max_x ? max : max_x;
			max = max > max_y ? max : max_y;
			System.out.println("#" + T + " " + max);

		}
	}
}
