package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_25605 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        arr.add(Integer.parseInt(st.nextToken())+1);
        for(int i=2;i<n+1;i++){
            arr.add(i-Integer.parseInt(st.nextToken())-1,i);
        }
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}