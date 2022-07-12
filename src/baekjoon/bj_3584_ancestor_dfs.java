package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj_3584_ancestor_dfs {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int i = 0; i < test; i++) {
			Queue<Integer> q1 = new LinkedList<>();
			Queue<Integer> q2 = new LinkedList<>();
			int a, b, n = 0;
			n = sc.nextInt();
			boolean arr[][] = new boolean[n + 1][n + 1];
			for (int j = 1; j <= n - 1; j++) {
				a = sc.nextInt();
				b = sc.nextInt();
				arr[b][a] = true;
			}
			a = sc.nextInt();
			b = sc.nextInt();
			q1.add(a);
			q2.add(b);
			for (int p = 1; p <= n; p++) {
				if (arr[a][p]) {
					q1.add(p);
					a = p;
					p = 1;
				}
			}
			for (int p = 1; p <= n; p++) {
				if (arr[b][p]) {
					q2.add(p);
					b = p;
					p = 1;
				}
			}
			if (q1.size() > q2.size()) {
				while (!q1.isEmpty()) {
					int temp = q1.poll();
					if (q2.contains(temp)) {
						System.out.println(temp);
						break;
					}
				}
			} else
				while (!q2.isEmpty()) {
					int temp = q2.poll();
					if (q1.contains(temp)) {
						System.out.println(temp);
						break;
					}
				}
		}
		sc.close();
	}
}