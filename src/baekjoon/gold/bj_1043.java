package baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_1043 {
    static boolean[] trust;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 사람 수
        int m = Integer.parseInt(st.nextToken()); // 파티 수
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken()); // 진실을 아는 사람의 수
        int count = 0;
        if (t == 0) {
            System.out.println(m);
            return;
        }

        trust = new boolean[n + 1];
        int num, temp;
        boolean ck = false;

        for (int i = 0; i < t; i++) {
            trust[Integer.parseInt(st.nextToken())] = true;
        }
        ArrayList<Integer>[] arr = new ArrayList[m];
        for (int i = 0; i < m; i++) {

            arr[i] = new ArrayList<>();

            st = new StringTokenizer(br.readLine());
            num = Integer.parseInt(st.nextToken());
            ck = false;
            for (int j = 0; j < num; j++) {
                temp = Integer.parseInt(st.nextToken());
                if (trust[temp]) {
                    ck = true;
                }
                arr[i].add(temp);
            }
            if (ck) {
                for (int j = 0; j < arr[i].size(); j++) {
                    trust[arr[i].get(j)] = true;
                }
            }
        }

        for(int i=0;i<m;i++){
            ck = true;
            for (int j = 0; j < arr[i].size(); j++) {
                if(trust[arr[i].get(j)])
                    ck = false;
            }
            if(ck)
                count++;
        }

        System.out.println(count);

    }
}
