package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class bj_2346 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque <Integer> dq = new LinkedList<>();
        Deque <Integer> dq_num = new LinkedList<>();
        for(int i=1;i<=n;i++){
            dq.add(Integer.parseInt(st.nextToken()));
            if(i==1){
                continue;   
            }
            dq_num.add(i);
        }
        StringBuffer sb = new StringBuffer();
        sb.append(1+" ");
        int temp = dq.poll();
        int tmp;
        while(!dq.isEmpty()){
            if(temp>0){
                for(int i=0;i<temp-1;i++){
                    tmp = dq.poll();
                    dq.add(tmp);
                    tmp = dq_num.poll();
                    dq_num.add(tmp);
                }
                temp = dq.poll();
                sb.append(dq_num.poll()+" ");
            }
            else{
                temp = Math.abs(temp);
                for(int i=0;i<temp-1;i++){
                    tmp = dq.pollLast();
                    dq.addFirst(tmp);
                    tmp = dq_num.pollLast();
                    dq_num.addFirst(tmp);
                }
                temp = dq.pollLast();
                sb.append(dq_num.pollLast()+" ");
            }
        }

        while(!dq_num.isEmpty()){
            sb.append(dq_num.poll()+" ");
        }
        System.out.println(sb);
    }
}
