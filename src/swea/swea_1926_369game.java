package swea;

import java.util.Scanner;

class swea_1926_369game {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			int count = 0;
			int temp = i;
			while (temp > 1) {
				if (temp % 10 == 3 || temp % 10 == 6 || temp % 10 == 9) {
					System.out.print("-");
					count++;
				}
				temp = temp / 10;
			}
			if (count == 0)
				System.out.print(i);
			System.out.print(" ");
		}

		sc.close();
	}
}