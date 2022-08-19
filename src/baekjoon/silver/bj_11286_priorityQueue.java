package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class bj_11286_priorityQueue {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int temp;
		PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
			int fir = Math.abs(o1);
			int sec = Math.abs(o2);
			if (fir == sec)
				return o1 > o2 ? 1 : -1;
			else
				return fir - sec;
		});
		for (int i = 0; i < n; i++) {
			temp = Integer.parseInt(br.readLine());
			if (temp == 0) {
				if (pq.isEmpty())
					System.out.println(0);
				else
					System.out.println(pq.poll());
			} else
				pq.offer(temp);
		}
	}
}
