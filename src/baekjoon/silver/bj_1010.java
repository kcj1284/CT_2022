package baekjoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class bj_1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[][] arr = new int[T][2];
		for (int i = 0; i < T; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = i;
		}
		Arrays.sort(arr);
		for(int i=0;i<T;i++) {
			System.out.println(arr[i][1]);	
		}
		sc.close();
	}
}
