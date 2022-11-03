package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2578 {
    static int[][] bingo;
    static int answer;

    public static void main(String[] args) throws Exception {
        bingo = new int[5][5];
        answer = 0;
        int cnt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int temp = 0;

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                cnt++;
                temp = Integer.parseInt(st.nextToken());
                change(temp);
                if(3<=check(bingo)){
                    System.out.println(cnt);
                    i = j = 5;
                }
            }
        }
       
    }

    static int check(int[][] arr) {
        int cnt = 0;
        boolean row, height, increase, decrease;
        row = height = increase = decrease = true;
        for (int i = 0; i < 5; i++) {
            if (arr[i][i] != 0) {
                decrease = false;
            }
            if (arr[i][4 - i] != 0) {
                increase = false;
            }
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] != 0) {
                    row = false;
                }
                if (arr[j][i] != 0) {
                    height = false;
                }

            }
            if (row)
                cnt++;
            if (height)
                cnt++;
            row = height = true;
        }
        if (increase)
            cnt++;
        if (decrease)
            cnt++;
        return cnt;
    }

    static void change(int num){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(bingo[i][j]==num)
                bingo[i][j] = 0;
            }
        }
    }
}
