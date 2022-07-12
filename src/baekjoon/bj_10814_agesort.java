package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class bj_10814_agesort {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[][] = new String[n][2];

		for (int i = 0; i < n; i++) {
			String age = sc.next();
			String name = sc.next();
			arr[i][0] = age;
			arr[i][1] = name;
		}
		Arrays.sort(arr, new Comparator<String[]>() {
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
		});

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}
