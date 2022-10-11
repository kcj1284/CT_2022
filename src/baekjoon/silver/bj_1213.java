package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_1213 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String str = br.readLine();
        char [] arr = str.toCharArray();
        
        if(arr.length==1){
            System.out.println(arr[0]);
            return;
        }
        int [] alpha = new int[26];
        for(int i=0;i<arr.length;i++){//알파벳 개수만큼 배열 생성
            alpha[arr[i]-65]++;
        }
        int cnt=0;
        int check=Integer.MAX_VALUE;
        for(int i=25;i>=0;i--){
            if(alpha[i]%2==1){//홀수개인 알파벳이 한개보다 많은지 체크
                cnt++;
                check = i;
                alpha[i]--;
            };
        }
        if(cnt>1){
            System.out.println("I'm Sorry Hansoo");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            if(alpha[i]==0) continue;
            while(alpha[i]>0){
                sb.append((char)(65+i));
                alpha[i]-=2;
            }
        }
        String ans = sb.toString();
        if(check<26)
            ans+=((char)(65+check));
        ans+=sb.reverse();
        System.out.println(ans);
    }
}