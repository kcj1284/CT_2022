package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj_5397 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<t;i++){
            Stack <Character> stfront = new Stack<>();
            Stack <Character> stback = new Stack<>();
            StringBuffer bffront = new StringBuffer();
            StringBuffer bfback = new StringBuffer();
            char [] pass = br.readLine().toCharArray();
            for(int j=0;j<pass.length;j++){
                if(pass[j]!='<'&&pass[j]!='>'&&pass[j]!='-'){
                    stfront.add(pass[j]);
                }
                else if(pass[j]=='-'&&!stfront.empty()){
                    stfront.pop();
                }
                else if(pass[j]=='<'&&!stfront.empty()){
                    stback.add(stfront.pop());
                }
                else if(pass[j]=='>'&&!stback.empty()){
                    stfront.add(stback.pop());
                }
            }

            while(!stfront.empty()){
                bffront.append(stfront.pop());
            }
            sb.append(bffront.reverse());
            while(!stback.empty()){
                bfback.append(stback.pop());
            }
            sb.append(bfback+"\n");
        }
        System.out.println(sb);
    }
}
