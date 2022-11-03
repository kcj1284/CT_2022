package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_2178 {
    static int[][] maze;
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, -1, 0, 1 };
    static int n, m;
    static Queue <Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        maze = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for (int j = 0; j < m; j++) {
                maze[i][j] = Integer.parseInt(str.substring(j, j+1));
            }
        }
        road(0, 0);
        System.out.println(maze[n-1][m-1]);
    }

    static void road(int x, int y) {
        for (int i = 0; i < 4; i++) {
            if (x + dx[i] < n && x + dx[i] >= 0 && y + dy[i] < m && y + dy[i] >= 0) {
                if (maze[x + dx[i]][y + dy[i]] == 1){
                    maze[x + dx[i]][y + dy[i]] = maze[x][y] + 1;
                    queue.add(x + dx[i]);
                    queue.add(y + dy[i]);
                }                    
            }
        }
        if(!queue.isEmpty()){
             road(queue.poll(), queue.poll());
        }
    }
}
