package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj_2504 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] bra = br.readLine().toCharArray();
        int temp = 0;
        Stack <Character> stack = new Stack<>();
        for(int i=0;i<bra.length;i++){
            if(bra[i]=='('){
                stack.add('(');
            }
            else if(bra[i]=='['){
                stack.add('[');    
            }
            else if(bra[i]==')'){
                if(stack.pop()!='('){
                    System.out.println(0);
                    return;
                }
                
            }
            else if(bra[i]==']'){
                if(stack.pop()!='['){
                    System.out.println(0);
                    return;
                }    
            }
        }
    }
}
