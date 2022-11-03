package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_1325 {
    static ArrayList<Integer> num = new ArrayList<>();
    static int [] arr;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int a, b;
        arr = new int[n];

        for(int i=0;i<m;i++){
            st = new StringTokenizer(st.nextToken());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            num.add(a,b);
        }
        dfs(1);
    }
    static void dfs(int n){
    }
}
