package baekjoon.bronze;

import java.util.Scanner;

public class bj_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean [][] white = new boolean [101][101];
        int cnt = 0;
        int t = sc.nextInt();
        for(int time = 0;time<t;time++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int i=x;i<x+10;i++){
                for(int j=y;j<y+10;j++){
                    white[i][j] = true;
                }
            }
        }
        for(int i=0;i<101;i++){
            for(int j=0;j<101;j++){
                if(white[i][j])
                    cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
