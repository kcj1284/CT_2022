package baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_13398 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[n+1];
        
        for(int i=1;i<=n;i++){
            arr[i] = arr[i-1]+Integer.parseInt(st.nextToken());
        }

        int max, max_front, max_end;
        max = max_front = max_end = Integer.MIN_VALUE;
        
        for(int t=0;t<n;t++){
            max_front = max_end = Integer.MIN_VALUE;
            for(int i=t-1;i>=0;i--){
                if(max_front<arr[t-1]-arr[i]){
                    max_front=arr[t-1]-arr[i];
                }
            }

            for(int i=t+1;i<=n;i++){
                if(max_end<arr[i]-arr[t]){
                    max_end=arr[i]-arr[t];
                }
            }

            if(max<max_front+max_end){
                if(arr[t]>0){
                    max = max_front+max_end+arr[t];
                }
                else
                    max = max_front+max_end;
            }
        }
        System.out.println(max);
    }
}
