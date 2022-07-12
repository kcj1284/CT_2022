package baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class bj_5568_cardsort {

	static HashSet<Integer> set = new HashSet<>();
	static int num [];
	static boolean [] visit;
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		num = new int [n];
		int arr[] = new int[k];
		visit = new boolean[n];

		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		dfs(0,k,arr);
		System.out.println(set.size());
	}
	
	public static void dfs(int str, int cnt, int arr[]) {
		if(str==cnt) {
			String sum = "";
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
			}
			set.add(Integer.valueOf(sum));
			return;
		}
		for(int i=0;i<num.length;i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[str] = num[i];
				dfs(str+1,cnt,arr);
				visit[i] = false;
			}
		}
	}
}
