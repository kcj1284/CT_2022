package baekjoon.silver;

import java.util.Scanner;

public class bj_15650_StringBuilder_practice {
	static int[] arr;
	static int n, m;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		dfs(1, 0);
		System.out.print(sb);
		sc.close();
	}

	static void dfs(int at, int dept) {
		if (dept == m) {
			for (int temp : arr)
				sb.append(temp + " ");
			sb.append("\n");
			return;
		}
		for (int i = 1; i <= n; i++) {
			arr[dept] = i;
			dfs(i, dept + 1);
		}
	}
}
