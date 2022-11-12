package baekjoon.silver;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class bj_11931 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int t = sc.nextInt();
        int arr [] = new int[t];
        for(int i=0;i<t;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=t-1;i>=0;i--){
            sb.append(arr[i]+"\n");
        }
        System.out.println(sb);
    }
}
