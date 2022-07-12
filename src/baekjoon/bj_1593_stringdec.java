package baekjoon;

import java.util.Scanner;

public class bj_1593_stringdec {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int w_len = sc.nextInt();
		int s_len = sc.nextInt();
		String w = sc.next();
		String s = sc.next();
		int count = 0;
		int check = 0;

		char w_arr[] = w.toCharArray();
		char s_arr[] = s.toCharArray();
		int alpha[] = new int[100];

		for (int i = 0; i < w_len; i++) { // word 알파벳 개수 체크
			alpha[w_arr[i] - '0']++;
		}
		for (int i = 0; i < s_len - w_len; i++) {
			int temp[] = new int[100];
			same(alpha, temp);
			check = 0;
			for (int j = i; j < i + w_len; j++) {
				if (temp[s_arr[j] - '0'] > 0) {
					temp[s_arr[j] - '0']--;
					check++;
				}
			}
			if (check == w_len) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

	public static void same(int arr1[], int arr2[]) {
		for (int i = 0; i < 100; i++) {
			arr2[i] = arr1[i];
		}
	}
}
