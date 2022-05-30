package swea;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

class swea_14361_multi {
	public static boolean tf;

	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("res/14361.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int num = sc.nextInt();
			int temp = num;
			int mul[] = new int[8];
			String str = Integer.toString(num);
			int arr[] = new int[str.length()];
			tf = false;
			for (int i = 0; i < str.length(); i++) {
				arr[i] = temp % 10;
				temp /= 10;
			}

			Arrays.sort(arr);

			for (int i = 2; i < 10; i++) { // 배수들 저장
				mul[i - 2] = num * i;
			}

			for (int i = 0; i < 8; i++) {
				int check[] = new int[str.length()];
				int tmp = mul[i];
				for (int j = 0; j < str.length(); j++) {
					check[j] = tmp % 10;
					tmp /= 10;
				}
				Arrays.sort(check);
				if (Arrays.equals(arr, check)) {
					tf = true;
					break;
				}
			}

			String imp = "impossible";

			if (tf)
				imp = "possible";
			System.out.printf("#%d %s%n", test_case, imp);
		}
	}

}
