package baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class bj_1715 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        if(t==1){
            System.out.println(0);
            return;
        }
        int cnt = 0;
        int temp1 = 0;
        int temp2 = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<t;i++){
            pq.add(Integer.parseInt(br.readLine()));
        }
        while(!pq.isEmpty()){
            temp1 = pq.poll();
            temp2 = pq.poll();
            cnt += temp1+temp2;
            if(pq.isEmpty())
                break;
            pq.add(temp1+temp2);
        }
        System.out.println(cnt);
    }
}
