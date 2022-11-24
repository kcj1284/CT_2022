package baekjoon.silver;

import java.util.Scanner;

public class bj_11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d [] = new long [n+1];
        d[1] = 1;
        d[2] = 2;
        for(int i=3;i<=n;i++){
            d[i] = (d[i-2]+d[i-1])%10007;
        }
        System.out.println(d[n]);
    }
}