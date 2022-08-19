package baekjoon.silver;

import java.util.Scanner;

public class bj_1541 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split("-");
		int answer = cal(str[0]);
		for (int i = 1; i < str.length; i++) {
			answer -= cal(str[i]);
		}
		System.out.println(answer);
		sc.close();
	}

	public static int cal(String str) {
		int answer = 0;
		String[] arr = str.split("[+]");
		for (int i = 0; i < arr.length; i++) {
			answer += Integer.parseInt(arr[i]);
		}
		return answer;
	}
}
