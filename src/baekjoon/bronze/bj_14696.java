package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class bj_14696 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int cnt, acnt, bcnt;
        boolean check;
        acnt = bcnt = 0;
        for (int time = 0; time < t; time++) {
            check = false;
            cnt = acnt = bcnt = 0;
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            acnt = Integer.parseInt(st.nextToken());
            while (st.hasMoreTokens()) {
                a.add(Integer.parseInt(st.nextToken()));
            }
            st = new StringTokenizer(br.readLine());
            bcnt = Integer.parseInt(st.nextToken());
            while (st.hasMoreTokens()) {
                b.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(a, Collections.reverseOrder());
            Collections.sort(b, Collections.reverseOrder());

            cnt = acnt > bcnt ? bcnt : acnt;

            for (int i = 0; i < cnt; i++) {
                if (a.get(i) > b.get(i)) {
                    System.out.println("A");
                    break;
                } else if (a.get(i) < b.get(i)) {
                    System.out.println("B");
                    break;
                }

                if (i == cnt - 1) {
                    check = true;
                }
            }
            if (check) {
                if (acnt > bcnt)
                    System.out.println("A");
                else if (acnt < bcnt)
                    System.out.println("B");
                else
                    System.out.println("D");
            }
        }
    }
}