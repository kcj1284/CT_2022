package baekjoon.bronze;

import java.util.Scanner;

public class bj_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		str = str.trim();
		str = str.replaceAll(" ", "!");
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '!')
				count++;
		}
		if (count == 0)
			if (arr.length == 0)
				System.out.println(0);
			else
				System.out.println(1);
		else
			System.out.println(count + 1);
		sc.close();
	}
}