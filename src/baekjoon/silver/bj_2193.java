package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_2193 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long d [][] = new long [n+1][2];
        d[1][0] = 0;
        d[1][1] = 1;
        for(int i = 2;i<=n;i++){
            d[i][0] = d[i-1][0] + d[i-1][1];
            d[i][1] = d[i-1][0];
        }
        System.out.println(d[n][0]+d[n][1]);
    }
}
