package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class bj_2667 {
    static int[] dir_x = { 0, 1, 0, -1 };
    static int[] dir_y = { 1, 0, -1, 0 };
    static ArrayList<Integer> arr;
    static Queue<Integer> queue = new LinkedList<>();
    static int[][] sq;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        sq = new int[t][t];
        String str;
        int cnt = 0;
        arr = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            str = br.readLine();
            for (int j = 0; j < t; j++) {
                sq[i][j] = Integer.parseInt(str.substring(j, j + 1));
            }
        }

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (sq[i][j] == 1) {
                    cnt = 0;
                    bfs(i, j, cnt);
                }
            }
        }

        Collections.sort(arr);
        System.out.println(arr.size());
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }

    static void bfs(int i, int j, int cnt) {
        int x, y;
        queue.add(i);
        queue.add(j);

        while (!queue.isEmpty()) {
            cnt++;
            x = queue.poll();
            y = queue.poll();
            sq[x][y] = 0;
            for (int k = 0; k < 4; k++) {
                if (x + dir_x[k] >= 0 && x + dir_x[k] < sq.length && y + dir_y[k] >= 0 && y + dir_y[k] < sq.length) {
                    if (sq[x + dir_x[k]][y + dir_y[k]] == 1) {
                        sq[x + dir_x[k]][y + dir_y[k]] = 0;
                        queue.add(x + dir_x[k]);
                        queue.add(y + dir_y[k]);
                    }
                }
            }
        }
        arr.add(cnt);
    }
}
