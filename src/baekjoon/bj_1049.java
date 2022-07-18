package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class bj_1049 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr1 = new int[M];
		int[] arr6 = new int[M];
		for (int i = 0; i < M; i++) {
			arr6[i] = sc.nextInt();
			arr1[i] = sc.nextInt();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr6);
		
		int one = arr1[0];
		int six = arr6[0];
		
		if (one>=six) {
			int count = N / 6;
			if (N % 6 != 0)
				count++;
			System.out.println(count * six);
		} else {
			int count = N / 6;
			int nam = N % 6;
			if (nam * one >= six) {
				count++;
				System.out.println(count * six);
			} else
				System.out.println(count * six + nam * one);
		}

		sc.close();
	}
}