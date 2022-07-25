package baekjoon;

import java.util.Scanner;

public class bj_15649 {
	static int [] arr;
	static boolean [] ch;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		arr = new int[m];
		ch = new boolean[n];
		dfs(n,m,0);
		sc.close();
	}
	static void dfs(int n,int m,int dept) {
		if(dept==m) {
			for(int temp : arr) {
				System.out.print(temp +" ");
			}
			System.out.println();
			return;
		}
		for(int i=0;i<n;i++) {
			if(!ch[i]) {
				ch[i] = true;
				arr[dept] = i+1;
				dfs(n,m,dept+1);
				ch[i] = false;
			}
		}
		
	}

}
