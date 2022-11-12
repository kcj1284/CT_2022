package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj_4949 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            Stack<Integer> stack = new Stack<>();
            char[] cha = br.readLine().toCharArray();
            if (cha[0] == '.')
                break;
            for (int i = 0; i < cha.length; i++) {
                if (cha[i] == '(') {
                    stack.push(1);
                } else if (cha[i] == '{') {
                    stack.push(2);
                } else if (cha[i] == '[') {
                    stack.push(3);
                } else if (cha[i] == ')') {
                    if (stack.empty()) {
                        System.out.println("no");
                        break;
                    }
                    if (stack.pop() != 1) {
                        System.out.println("no");
                        break;
                    }
                } else if (cha[i] == '}') {
                    if (stack.empty()) {
                        System.out.println("no");
                        break;
                    }
                    if (stack.pop() != 2) {
                        System.out.println("no");
                        break;
                    }
                } else if (cha[i] == ']') {
                    if (stack.empty()) {
                        System.out.println("no");
                        break;
                    }
                    if (stack.pop() != 3) {
                        System.out.println("no");
                        break;
                    }
                } else if (cha[i] == '.' && stack.empty()) {
                    System.out.println("yes");
                } else if (cha[i] == '.' && !stack.empty())
                    System.out.println("no");
            }
        }
    }
}
