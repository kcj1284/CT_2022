package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_15654 {
    static int [] num;
    static boolean [] visited;
    static int n,m;
    static int [] arr; 
    static StringBuffer sb;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuffer();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        num = new int [n];
        visited = new boolean[n];
        arr = new int [m];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);
        dfs(0,0);
        System.out.println(sb);
    }

    static void dfs(int at, int cnt){
        if(cnt==m){
            for(int i:arr){
                sb.append(i+" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0;i<n;i++){
            if(!visited[i]){
                arr[cnt] = num[i];
                visited[i] = true;
                dfs(i, cnt+1);
                visited[i] = false;
            }
        }
    }

}
