package NeedToRetry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_2644 {
	static boolean[] visite;
	static ArrayList<Integer>[] arr;
	static int cnt = -1;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		visite = new boolean[n + 1];
		arr = new ArrayList[n + 1];
		for (int i = 1; i < n + 1; i++) {
			arr[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[x].add(y);
			arr[y].add(x);
		}
		dfs(a, b, 0);
		System.out.println(cnt);
	}

	static void dfs(int str, int end, int count) {
		if (str == end) {
			cnt = count;
			return;
		}
		visite[str] = true;
		for (int i = 0; i < arr[str].size(); i++) {
			int next = arr[str].get(i);
			if (!visite[next]) {
				dfs(next, end, count + 1);
			}
		}
	}

}
