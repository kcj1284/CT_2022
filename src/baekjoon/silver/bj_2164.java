package baekjoon.silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj_2164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		int n = sc.nextInt();
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
		while (!queue.isEmpty()) {
			answer = queue.poll();
			if (!queue.isEmpty())
				queue.add(queue.poll());
		}
		System.out.println(answer);
	}
}