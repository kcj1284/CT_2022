package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_11724 {
	static ArrayList<Integer>[] al;
	static boolean[] ch;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int a;
		int b;
		int count = 0;
		al = new ArrayList[n + 1];
		ch = new boolean[n + 1];
		for (int i = 1; i < n + 1; i++) {
			al[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			al[a].add(b);
			al[b].add(a);
		}
		for (int i = 1; i < n + 1; i++) {
			if (!ch[i]) {
				count++;
				dfs(i);
			}
		}
		System.out.println(count);
	}

	static void dfs(int k) {
		if (ch[k])
			return;
		ch[k] = true;
		for (int i : al[k]) {
			if (!ch[i])
				dfs(i);
		}
	};

}
