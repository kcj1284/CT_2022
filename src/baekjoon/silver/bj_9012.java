package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_9012 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            char [] arr = st.nextToken().toCharArray();
            int count = 0;
            for(int j = 0;j<arr.length;j++){
                if(arr[j]=='('){
                    count++;
                }
                else{
                    count--;
                    if(count<0){
                        
                        break;
                    }
                }
            }
        if(count==0){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
        }
    }
}
