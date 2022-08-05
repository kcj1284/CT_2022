package baekjoon.silver;

import java.util.Scanner;

public class bj_2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		String str = sc.next();
		String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		for (int i = 0; i < arr.length; i++) {
				str = str.replaceAll(arr[i], "!");
		}
		answer = str.length();
		System.out.println(answer);
		sc.close();
	}
}