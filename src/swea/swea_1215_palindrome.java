package swea;

import java.util.Scanner;
import java.io.FileInputStream;

class swea_1215_palindrome {
	public static void main(String args[]) throws Exception {

		// System.setIn(new FileInputStream("res/1215.txt"));
		Scanner sc = new Scanner(System.in);
		for (int k = 1; k <= 10; k++) {
			int T;
			T = sc.nextInt();
			if (T == 1) {
				System.out.println("#" + k + " " + 64);
				continue;
			}
			char[][] str = new char[8][8];
			char[][] str_rev = new char[8][8];

			for (int i = 0; i < 8; i++) {
				String temp = sc.next();
				for (int j = 0; j < 8; j++) {
					str[i][j] = temp.charAt(j);
					str_rev[j][i] = temp.charAt(j);
				}
			}
			System.out.println("#" + k + " " + (mirror(str, T) + mirror(str_rev, T)));

		}
	}

	public static int mirror(char[][] mir, int num) {
		int cnt = 0;
		boolean flag = true;
		if (num == 2) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 6; j = j + 2) {
					if (mir[i][j] == mir[i][j + 1])
						cnt++;
				}
			}
			return cnt;
		}
		for (int i = 0; i < 8; i++) {
			for (int n = 0; n <= 8 - num; n++) {
				flag = true;
				for (int j = 0; j < (num / 2); j++) {
					if (mir[i][j + n] != mir[i][num + n - j - 1])
						flag = false;
				}
				if (flag)
					cnt++;
			}
		}
		return cnt;
	}
}