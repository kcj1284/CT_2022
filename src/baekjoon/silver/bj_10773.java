package baekjoon.silver;

import java.util.Scanner;
import java.util.Stack;

public class bj_10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int num = 0;
        int count = 0;
        Stack <Integer> stack = new Stack<>();
        for(int i=0;i<t;i++){
            num = sc.nextInt();
            if(num==0){
                stack.pop();
            }
            else
                stack.push(num);
        }
        while(!stack.empty()){
            count+=stack.pop();
        }
        System.out.println(count);
    }
}
