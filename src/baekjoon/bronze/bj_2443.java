package baekjoon.bronze;

import java.util.Scanner;

public class bj_2443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n+1;i++){
            for(int j=0;j<i-1;j++){
                System.out.print(" ");
            }
            for(int j=2*n+1-i*2;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
