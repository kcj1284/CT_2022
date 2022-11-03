package baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class bj_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int a, b;
        a = b = 0;
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    a = i;
                    b = j;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            if(i==a||i==b){
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
