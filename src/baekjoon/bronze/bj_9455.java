package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj_9455 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(st.nextToken());
            while(t>0){
                t--;
                int cnt=0;
                st = new StringTokenizer(br.readLine());
                int m = Integer.parseInt(st.nextToken());
                int n = Integer.parseInt(st.nextToken());
                int [][] box = new int [m][n];
                for(int i=0;i<m;i++){
                    st = new StringTokenizer(br.readLine());
                    for(int j=0;j<n;j++){
                        box[i][j] = Integer.parseInt(st.nextToken());
                    }
                }

                for(int j=0;j<n;j++){
                    for(int i=0;i<m;i++){
                        if(box[i][j]==1){
                            for(int k=i;k<m;k++){
                                if(box[k][j]==0){
                                    cnt++;
                                }
                            }
                        }
                    }
                }
                sb.append(cnt+"\n");
            }
            System.out.println(sb);
        }
}
