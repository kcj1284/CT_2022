package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2491 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int max = 1;
        int temp_des = 1;
        int temp_asc = 1;
        int [] arr = new int [n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                max = Math.max(temp_des, max);
                temp_des = 1;
                temp_asc++;
            }
            if(arr[i]>arr[i+1]){
                max = Math.max(temp_asc, max);
                temp_asc = 1;
                temp_des++;
            }
            if (arr[i]==arr[i+1]){
                temp_asc++;
                temp_des++;
            }
        }
        max = Math.max(temp_asc, max);
        max = Math.max(temp_des, max);
        System.out.println(max);
    }
}
