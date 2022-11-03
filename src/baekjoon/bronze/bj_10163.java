package baekjoon.bronze;

import java.util.Scanner;
import java.util.Stack;

public class bj_10163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[4][n];
        boolean[][] size = new boolean[1002][1002];
        Stack<Integer> st = new Stack<>();
        int x, y, w, h, cnt;
        x = y = w = h = cnt = 0;
        for (int i = 0; i < n; i++) {
            arr[0][i] = sc.nextInt();
            arr[1][i] = sc.nextInt();
            arr[2][i] = sc.nextInt();
            arr[3][i] = sc.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            cnt = 0;
            x = arr[0][i];
            y = arr[1][i];
            w = arr[2][i];
            h = arr[3][i];
            for (int p = x; p < x + w; p++) {
                for (int q = y; q < y + h; q++) {
                    if (!size[p][q]) {
                        size[p][q] = true;
                        cnt++;
                    }
                }
            }
            st.add(cnt);
        }

        while (!st.empty()) {
            System.out.println(st.pop());
        }

        sc.close();
    }
}