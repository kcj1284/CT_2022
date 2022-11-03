package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class bj_2628 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int max_x,max_y;
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        ArrayList <Integer> arr_x = new ArrayList<>();
        ArrayList <Integer> arr_y = new ArrayList<>();
        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            if(Integer.parseInt(st.nextToken())==0){
                arr_y.add(Integer.parseInt(st.nextToken()));
                if(t==1){
                    max_y = arr_y.get(0)>=y-arr_y.get(0)?arr_y.get(0):y-arr_y.get(0);
                    System.out.println(max_y*x);
                    return;
                }
            }
            else {
                arr_x.add(Integer.parseInt(st.nextToken()));
                if(t==1){
                    max_x = arr_x.get(0)>=x-arr_x.get(0)?arr_x.get(0):x-arr_x.get(0);
                    System.out.println(max_x*y);
                    return;
                }
            }
        }

        Collections.sort(arr_y);
        Collections.sort(arr_x);
        max_y = arr_y.get(0);
        max_x = arr_x.get(0);
        for(int i=1;i<arr_y.size();i++){
            if((arr_y.get(i)-arr_y.get(i-1)>max_y))
                max_y = arr_y.get(i)-arr_y.get(i-1);
        }

        for(int i=1;i<arr_x.size();i++){
            if((arr_x.get(i)-arr_x.get(i-1)>max_x))
                max_x = arr_x.get(i)-arr_x.get(i-1);
        }

        max_y = (y - arr_y.get(arr_y.size()-1))>max_y?(y - arr_y.get(arr_y.size()-1)):max_y;
        max_x = (x - arr_x.get(arr_x.size()-1))>max_x?(x - arr_x.get(arr_x.size()-1)):max_x;

        System.out.println(max_y*max_x);
    }
}
