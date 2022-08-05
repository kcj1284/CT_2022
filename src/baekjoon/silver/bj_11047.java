package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_11047 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int [] coin = new int[n];
		int count =0;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			coin[i] = Integer.parseInt(st.nextToken());
		}
		while(k>0) {
			for(int i=n-1;i>=0;i--) {
				if(k>=coin[i]) {
					k -= coin[i];
					count++;
					i++;
				}
			}
		}
		System.out.println(count);
	}

}
