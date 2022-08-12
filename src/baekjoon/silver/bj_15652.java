package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_15652 {
	static int n, m;
	static int[] arr;
	static StringBuilder sb;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		dfs(1, 0);
		System.out.println(sb);
	}

	static void dfs(int at, int dept) {
		if (dept == m) {
			for (int i : arr)
				sb.append(i + " ");
			sb.append("\n");
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (dept > 0) {
				if (arr[dept - 1] <= i) {
					arr[dept] = i;
					dfs(i, dept + 1);
				} else
					continue;
			} else {
				arr[dept] = i;
				dfs(i, dept + 1);
			}
		}
	}
}
