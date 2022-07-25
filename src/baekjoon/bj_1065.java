package baekjoon;

import java.util.Scanner;

public class bj_1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,b,c;
		int count = 99;
		if (n < 100)
			System.out.print(n);
		else {
			for (int i = 100; i <= n; i++) {
				a = i / 100;
				b = (i / 10) % 10;
				c = i % 10;
				if (a - b == b - c)			
					count++;
			}
			System.out.println(count);
		}
		sc.close();
	}

}