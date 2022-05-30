package swea;

import java.util.Scanner;
import java.io.FileInputStream;

class swea_1954_snail {
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("res/1954.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int size = sc.nextInt();
			int arr[][] = new int[size][size];
			int count = 1, x = 0, y = 0, d = 0;
			int[] dx = { 1, 0, -1, 0 };
			int[] dy = { 0, 1, 0, -1 };
			while (count <= size * size) {
				arr[y][x] = count;
				count++;
				x = x + dx[d];
				y = y + dy[d];
				if (x >= size || x < 0 || y >= size || y < 0 || arr[y][x] != 0) {
					x = x - dx[d];
					y = y - dy[d];
					d = (d + 1) % 4;
					x = x + dx[d];
					y = y + dy[d];
				}
			}
			System.out.println("#" + test_case);
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}