package baekjoon;

import java.util.Scanner;

public class bj_2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = 0;
		if(N==1)
			answer++;
		while(N>1) {
			N = N-6*answer;
			answer++;
		}
		System.out.println(answer);
		sc.close();
	}
}