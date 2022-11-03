package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_13300 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int answer = 0;
        int[] man = new int[7];
        int[] woman = new int[7];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken());
            int age = Integer.parseInt(st.nextToken());
            if (sex == 1) {
                man[age]++;
            } else
                woman[age]++;
        }
        for(int i=1;i<7;i++){
            answer = answer+(man[i]/m)+(woman[i]/m);
            if(man[i]%m!=0)
                answer++;
            if(woman[i]%m!=0)
                answer++;
        }
        System.out.println(answer);
    }
}