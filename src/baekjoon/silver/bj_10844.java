package baekjoon.silver;

import java.util.Scanner;

public class bj_10844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long answer = 0;
        long [][] d = new long [n+1][10];
        for(int i=1;i<=9;i++){
            d[1][i] = 1;
        }
        for(int i=2;i<=n;i++){
            for(int j=0;j<=9;j++){
                if(j == 0) {
                    d[i][0] = d[i - 1][1];
                }
                else if (j == 9) {
                    d[i][9] = d[i - 1][8];
                }
                else {
                    d[i][j] = (d[i - 1][j - 1] + d[i - 1][j + 1])%1000000000;
                }
            }
        }
        for(int i=0;i<=9;i++){
            answer +=d[n][i];
        }
        System.out.println(answer%1000000000);
        sc.close();
    }
}
