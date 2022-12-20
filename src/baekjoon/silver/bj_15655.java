package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_15655 {
    static int n,m;
    static int [] num;
    static boolean [] visited;
    static int [] arr;
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        num = new int [n];
        visited = new boolean[n];
        arr = new int[m];
        for(int i=0;i<n;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);
        dfs(0,0);
        System.out.println(sb);
    }
    static void dfs(int st, int cnt){
        if(cnt==m){
            for(int i:arr){
                sb.append(i+" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0;i<n;i++){
            if(!visited[i]){
                if(st>0){
                    if(arr[st-1]>num[i]){
                        continue;
                    }    
                }
                arr[st] = num[i];
                visited[i] = true;
                dfs(st+1,cnt+1);
                visited[i] = false;
            }
        }
    }
}
