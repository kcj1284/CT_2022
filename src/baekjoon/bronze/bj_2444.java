package baekjoon.bronze;

import java.util.Scanner;

public class bj_2444 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=(n-i)*2-1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
	}
}