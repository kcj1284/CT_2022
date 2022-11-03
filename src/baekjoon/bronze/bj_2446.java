package baekjoon.bronze;

import java.util.Scanner;

public class bj_2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=(t-i)*2-1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<t;i++){
            for(int j=t;j>i+1;j--){
                System.out.print(" ");
            }for(int j=i*2+1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
