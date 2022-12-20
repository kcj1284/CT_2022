package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class bj_18258 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        int n = Integer.parseInt(br.readLine());
        Deque <Integer> dq = new LinkedList();
        StringBuffer sb = new StringBuffer();
        String str;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            str = st.nextToken();
            if(str.equals("push")){
                dq.add(Integer.parseInt(st.nextToken()));
            }
            else if(str.equals("pop")){
                if(dq.isEmpty()){
                    sb.append("-1\n");
                }
                else{
                    sb.append(dq.pollFirst()+"\n");
                }
            }
            else if(str.equals("size")){
                sb.append(dq.size()+"\n");
            }
            else if(str.equals("empty")){
                if(dq.isEmpty()){
                    sb.append(1+"\n");    
                }
                else{
                    sb.append(0+"\n");
                }
            }
            else if(str.equals("front")){
                if(dq.isEmpty()){
                    sb.append("-1\n");
                }
                else{
                    sb.append(dq.peekFirst()+"\n");
                }
            }
            else if(str.equals("back")){
                if(dq.isEmpty()){
                    sb.append("-1\n");
                }
                else{
                    sb.append(dq.peekLast()+"\n");
                }
            }
        }
        System.out.println(sb);
    }
}
