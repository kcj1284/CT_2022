package baekjoon.bronze;

import java.util.Scanner;

public class bj_2669 {
    static boolean[][] arr;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        arr = new boolean[101][101];
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            area(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
            }
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (arr[i][j])
                    cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }

    static void area(int x1, int y1, int x2, int y2) {
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                arr[i][j] = true;
            }
        }
    }
}