package baekjoon;

import java.util.Scanner;

public class bj_9663 {
	static boolean[] visit;
	static int[] arr;
	static int n;
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		visit = new boolean[n];
		dfs(0);
		sc.close();
	}

	static void dfs(int dept) {
		if (dept == n) {
			count++;
		}
		
		for(int i=0;i<n;i++) {
			if(!visit[i]) {
				visit[i]=true;
				arr[i]=i;
				dfs(dept+1);
				visit[i] = false;
			}
		}

	}

	static boolean check(int [] arr) {
		boolean T = true;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==i)
					T = false;
			}
		return T;
	}
}