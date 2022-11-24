package baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_2617 {
    static int [][] marble;
    static boolean [] visited;
    static Queue <Integer> queue = new LinkedList<>();
    static int a, b, num;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        marble = new int [n+1][n+1];
        for(int i = 0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            marble[a][b] = 1;
            marble[b][a] = -1;
        }

        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(marble[i][j]!=0){
                    visited = new boolean[n+1];
                    bfs(i, j, marble[i][j]);
                }
            }
        }
    }
    static void bfs(int i, int j, int size){
        queue.add(j);
        while(!queue.isEmpty()){
            num = queue.poll();
            
        }
    }
}