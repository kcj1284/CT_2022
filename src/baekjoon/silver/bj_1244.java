package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1244 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        boolean[] arr = new boolean[len + 1];
        boolean ck = true;
        int max, min, sex, swi;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < len + 1; i++) {
            if (Integer.parseInt(st.nextToken()) == 1) {
                arr[i] = true;
            }
        }
        st = new StringTokenizer(br.readLine());
        int man = Integer.parseInt(st.nextToken());
        for (int i = 1; i < man + 1; i++) {
            st = new StringTokenizer(br.readLine());
            sex = Integer.parseInt(st.nextToken());
            swi = Integer.parseInt(st.nextToken());
            if (sex == 1) {
                for (int j = swi; j < len + 1; j += swi) {
                    arr[j] = (!arr[j]);
                }
            } else {
                max = min = swi;
                while ((max + 1) <= len && (min - 1) >= 1) {
                    ck = false;
                    max++;
                    min--;
                    if (arr[max] != arr[min] || (max + 1) > len || (min - 1) < 1) {
                        for (int k = min + 1; k <= max - 1; k++) {
                            arr[k] = (!arr[k]);
                        }
                        break;
                    }
                }
                if(ck){
                    arr[swi] = (!arr[swi]);
                }
            }

            
        }
        for (int k = 1; k < len + 1; k++) {
            if (arr[k]) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
            if ((k % 20 == 0) && (k != 0)) {
                System.out.println();
            }
        }
    }
}