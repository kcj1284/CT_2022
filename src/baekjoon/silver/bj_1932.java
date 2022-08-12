package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_1932 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][n];
		st = new StringTokenizer(br.readLine());
		arr[0][0] = Integer.parseInt(st.nextToken());
		for (int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<=i;j++) {
				if(j==0)
					arr[i][j] = arr[i-1][j]+Integer.parseInt(st.nextToken());
				else {
					arr[i][j] = (arr[i-1][j-1]>arr[i-1][j]?arr[i-1][j-1]:arr[i-1][j])+Integer.parseInt(st.nextToken());
				}
			}	
		}

		Arrays.sort(arr[n-1]);
		System.out.println(arr[n-1][n-1]);
	}
}
