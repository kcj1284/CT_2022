package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_11403 {
    static ArrayList<Integer>[] route;
    static int[][] con;
    static int temp;
    static boolean[] visited;

    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        route = new ArrayList[n];
        con = new int[n][n];
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++) {
            route[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                if (Integer.parseInt(st.nextToken()) == 1) {
                    route[i].add(j);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            visited = new boolean[n];
            bfs(i);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(con[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }

    static void bfs(int num) {
        queue.add(num);
        while (!queue.isEmpty()) {
            temp = queue.poll();
            for (int i = 0; i < route[temp].size(); i++) {
                if (!visited[route[temp].get(i)]) {
                    queue.add(route[temp].get(i));
                    con[num][route[temp].get(i)] = 1;
                    visited[route[temp].get(i)] = true;
                }
            }

        }
    }

}
