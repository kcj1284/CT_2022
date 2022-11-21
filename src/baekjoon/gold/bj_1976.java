package baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_1976 {
    static ArrayList <Integer> [] arr;
    static int [] par;
    static Queue <Integer> queue = new LinkedList<>();
    static int temp;
    static boolean [] visited;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        arr = new ArrayList [n];
        par = new int [n];
        boolean ck = true;
        for(int i=0;i<n;i++){
            arr[i] = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                if(Integer.parseInt(st.nextToken())==1)
                    arr[i].add(j);
            }
            par[i] = i;
        }

        for(int i=0;i<n;i++){
            visited = new boolean[n];
            bfs(i);
        }

        st = new StringTokenizer(br.readLine());
        int fir = par[Integer.parseInt(st.nextToken())-1];
        for(int i=0;i<m-1;i++){
            if(par[Integer.parseInt(st.nextToken())-1]!=fir){
                ck = false;
                break;
            }
        }
        if(ck)
            System.out.println("YES");
        else
            System.out.println("NO");
        
    }
    static void bfs(int num){
        queue.add(num);
        while(!queue.isEmpty()){
            temp = queue.poll();
            if(!visited[temp]){
                for(int i=0;i<arr[temp].size();i++){
                    queue.add(arr[temp].get(i));
                    par[num] = Math.min(par[num],arr[temp].get(i));
                }
                visited[temp] = true;
            }
        }
    }
}
 