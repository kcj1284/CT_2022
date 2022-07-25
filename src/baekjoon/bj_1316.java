package baekjoon;

import java.util.Scanner;

public class bj_1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int answer = T;
		for (int i = 0; i < T; i++) {
			boolean[] visit = new boolean[26];
			String str = sc.next();
			char[] arr = str.toCharArray();

			if (arr.length == 0)
				continue;
			visit[(int) arr[0] - 97] = true;

			for (int j = 1; j < arr.length; j++) {

				if (arr[j] == arr[j - 1])
					continue;

				if (!visit[(int) arr[j] - 97])
					visit[(int) arr[j] - 97] = true;
				else {
					answer--;
					break;
				}
			}

		}
		System.out.println(answer);
		sc.close();
	}
}