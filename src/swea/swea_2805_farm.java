package swea;

import java.util.Scanner;

import java.io.FileInputStream;

class swea_2805_farm {
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("res/2805.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int size = sc.nextInt();
			int arr[][] = new int[size][size];
			int num = 0;
			
			for (int i = 0; i < size; i++) {
				String temp = sc.next();
				for (int j = 0; j < size; j++) {
					arr[i][j] = temp.charAt(j)-'0';
				}
			}
			int area = 0, mid = (size / 2);
			
			for (int i = 0; i < size; ++i) {
				int st = mid - area;
				int en = mid + area;
				for (int j = st; j <= en; ++j) {
					num += arr[i][j];
				}
				
				if (i >= mid) {
					area--;
				} else {
					area++;
				}
			}
			
			System.out.printf("#%d %d%n",test_case,num);
		}
	}
}
