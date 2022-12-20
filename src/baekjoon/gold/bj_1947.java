package baekjoon.gold;

import java.util.Scanner;

public class bj_1947 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] num = new long [1000001];
        num[1] = 0;
        num[2] = 1;

        for(int i=3;i<=n;i++){
            num[i] = (i-1)*(num[i-2]+num[i-1])%1000000000;
        }
        
        System.out.println(num[n]);
        sc.close();
    }
}
