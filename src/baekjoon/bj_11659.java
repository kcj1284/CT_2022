package baekjoon;

import java.util.Scanner;

public class bj_11659 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int a, b;
		int temp = 0;
		int[] arr = new int[N + 1];
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			temp += sc.nextInt();
			arr[i] = temp;
		}
		for (int i = 0; i < M; i++) {
			a = sc.nextInt() - 1;
			b = sc.nextInt();
			sb.append(arr[b] - arr[a] + "\n");
		}
		System.out.print(sb);
		sc.close();
	}

}
