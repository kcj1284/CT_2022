package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_1325 {
    static ArrayList<Integer>[] num;
    static int[] arr;
    static boolean[] visited;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];
        num = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            num[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            num[Integer.parseInt(st.nextToken())].add(Integer.parseInt(st.nextToken()));
        }

        int max = 0;

        for (int i = 1; i < n + 1; i++) {
            visited = new boolean[n + 1];
            bfs(i);
        }

        for (int i = 1; i < n + 1; i++) {
            max = Math.max(max, arr[i]);
        }

        for (int i = 1; i < n + 1; i++) {
            if (max == arr[i]) {
                sb.append(i + " ");
            }
        }
        System.out.println(sb);
    }

    static void bfs(int n) {
        int temp = 0;
        queue.add(n);
        while (!queue.isEmpty()) {
            temp = queue.poll();
            for (int i = 0; i < num[temp].size(); i++) {
                if (!visited[num[temp].get(i)]) {
                    queue.add(num[temp].get(i));
                    arr[num[temp].get(i)]++;
                    visited[num[temp].get(i)] = true;
                }

            }
        }

    }
}