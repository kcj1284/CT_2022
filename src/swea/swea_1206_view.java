package swea;

import java.io.FileInputStream;import java.util.Scanner;

class swea_1206_view {
	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("res/1206.txt"));

		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {

			int num = sc.nextInt();
			int arr[] = new int[num];
			int count = 0;
			for (int i = 0; i < num; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 2; i < num - 2; i++) {
				int max1 = 0;
				int max2 = 0;

				if (arr[i] > arr[i - 1] && arr[i] > arr[i - 2] && arr[i] > arr[i + 1] && arr[i] > arr[i + 2]) {
					max1 = arr[i - 1] > arr[i - 2] ? arr[i - 1] : arr[i - 2];
					max2 = arr[i + 1] > arr[i + 2] ? arr[i + 1] : arr[i + 2];
					max1 = max1 > max2 ? max1 : max2;

					count += (arr[i] - max1);
				}
			}
			System.out.println("#" + test_case + " " + count);

		}
	}
}