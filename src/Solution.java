import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution {

	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("res/sample_input.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			int ans[] = new int[n];
			int count = 0;
			int tryed = 0;
			for (int i = 0; i < n; i++) {
				int temp = sc.nextInt();
				arr[i] = temp;
				ans[i] = temp;
			}
			Arrays.sort(ans);
			for (int j = 0; j < n; j++) {
				tryed = 0;
				for (int i = 0; i < n - 1; i = i + 2) {
					if (arr[i] > arr[i + 1]) {
						int temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
						tryed++;
					}
				}

				for (int i = 1; i < n - 2; i = i + 2) {
					if (arr[i] > arr[i + 1]) {
						int temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
						tryed++;
					}
				}
				if (!same(arr, ans))
					tryed++;

				if (tryed == 0)
					break;
				count++;
			}

			System.out.printf("#%d %d%n", test_case, count);
		}

		sc.close();
	}

	static boolean same(int arr1[], int arr2[]) {
		boolean t = true;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i])
				t = false;
		}
		return t;
	}
}