package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class bj_14425 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet <String> hs = new HashSet<>();
        int cnt = 0;
        for(int i=0;i<n;i++){
            hs.add(br.readLine());
        }
        for(int i=0;i<m;i++){
            if(hs.contains(br.readLine()))
                cnt++;
        }
        System.out.println(cnt);
    }
}
