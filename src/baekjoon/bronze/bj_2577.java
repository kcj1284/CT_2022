package baekjoon.bronze;

import java.util.Scanner;

public class bj_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String str = String.valueOf(a * b * c);
		int[] arr = new int[10];
		for (int i = 0; i < str.length(); i++) {
			arr[Integer.parseInt(str.substring(i,i+1))]++;
		}
		for(int i:arr) {
			System.out.println(i);
		}
	}

}