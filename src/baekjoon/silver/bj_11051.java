package baekjoon.silver;

import java.util.Scanner;

public class bj_11051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long answer = 1;
        for(int i=k+1;i<=n;i++){
            answer *= i;
        }
        for(int i=2;i<=(n-k);i++){
            answer /=i;
        }
        System.out.println(answer%10007);
    }
}
