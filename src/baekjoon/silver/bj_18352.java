package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_18352 {
    static int[] len;
    static ArrayList<ArrayList<Integer>> graph;
    static int n, m, k, x, cnt, temp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a, b;
        boolean ck = true;
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        cnt = 1;

        len = new int[n + 1];
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
            len[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }
        dfs(x, cnt);
        for (int o = 0; o < n + 1; o++) {
            if(o==x)
                continue;
            temp = len[o];
            if (temp == k) {
                System.out.println(o);
                ck = false;
            }
        }
        if (ck)
            System.out.println(-1);
    }

    public static void dfs(int x, int count) {
        if(count>k){
            return;
        }
        for (int i = 0; i < graph.get(x).size(); i++) {
            temp = graph.get(x).get(i);
            if (len[temp] > count) {
                len[temp] = count;
            }
            else{
                continue;
            }
            dfs(temp, count + 1);
        }
    }
}