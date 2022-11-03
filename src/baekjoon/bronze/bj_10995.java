package baekjoon.bronze;

import java.util.Scanner;

public class bj_10995 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            if(i%2==0){
                for(int j=0;j<t;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(int j=0;j<t;j++){
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
