package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class bj_2477 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int way, len, temp_x, temp_y, area;
        int [] x = new int [7];
        int [] y = new int [7];
        
        way = len = temp_x = temp_y = area = 0;

        for (int i = 1; i < 7; i++) {
            st = new StringTokenizer(br.readLine());
            way = Integer.parseInt(st.nextToken());
            len = Integer.parseInt(st.nextToken());
            if(way==1){
                temp_x += len;
            }
            else if(way==2){
                temp_x -= len;
            }
            else if(way==3){
                temp_y -= len;
            }
            else if(way==4){
                temp_y += len;
            }
            x[i] = temp_x;
            y[i] = temp_y;
        }
        for(int i=1;i<7;i++){
            area += x[i-1]*y[i];
            area -= y[i-1]*x[i];
        }
        System.out.println(Math.abs(area)/2*m);
    }
}
