package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj_1874 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int count = 1;
		for (int i = 0; i < n; i++) {
			if (count <= arr[i]) {
				stack.push(count);
				sb.append("+\n");
				count++;
				i--;
			} else {
				stack.pop();
				sb.append("-\n");
			}
		}
		System.out.println(sb);
	}
}
