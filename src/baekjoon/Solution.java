package baekjoon;

import java.util.Scanner;

class Solution {
	static int AnswerN = 0;
	static int N;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			char[][] arr = new char[N][N];
			int x = 0;
			int y = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.next().charAt(0);
					if (arr[i][j] == 'X') {
						y = i;
						x = j;
					}

				}
			}
			check(arr, y, x);

			System.out.println("#" + test_case + " " + AnswerN);
			AnswerN =0;
		}
	}

	static void check(char[][] arr, int i, int j) {
		int max_x = 0;
		int min_x = N;
		int max_y = 0;
		int min_y = N;
		int count = 0;

		for (int k = 0; k < j; k++) {
			if (arr[i][k] == 'Y')
				if (k > max_x)
					max_x = k;
		}
		for (int k = j; k < N; k++) {
			if (arr[i][k] == 'Y')
				if (k < min_x)
					min_x = k;
		}
		for (int k = 0; k < i; k++) {
			if (arr[k][j] == 'Y')
				if (k > max_y)
					max_y = k;
		}
		for (int k = i; k < N; k++) {
			if (arr[k][j] == 'Y')
				if (k < min_y)
					min_y = k;
		}
		
		//Y Ã£±â
		
		for (int k = max_x; k < j; k++) {
			if (arr[i][k] == 'H')
				count++;
		}
		if (count > 1)
			AnswerN ++;
			//AnswerN += count - 1;
		count = 0;

		for (int k = j; k < min_x; k++) {
			if (arr[i][k] == 'H')
				count++;
		}
		if (count > 1)
			AnswerN ++;
		count = 0;

		for (int k = max_y; k < i; k++) {
			if (arr[k][j] == 'H')
				count++;
		}
		if (count > 1)
			AnswerN ++;
		count = 0;
		
		for (int k = i; k < min_y; k++) {
			if (arr[k][j] == 'H')
				count++;
		}
		if (count > 1)
			AnswerN ++;
		count = 0;
		
	}
}
