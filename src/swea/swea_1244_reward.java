package swea;

import java.util.Scanner;
import java.io.FileInputStream;

public class swea_1244_reward {
	public static int result;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("res/1244.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int number = sc.nextInt();
			int cnt = sc.nextInt();

			// 1. ���� �ϳ� �� ���� char array�� ����
			char[] numbers = Integer.toString(number).toCharArray();
			result = 0;

			// 2. �ִ� ��ȯ Ƚ���� �� ���ڸ� ���� �ʰ� �ϰ�, dfs Ž�� ����
			//if (numbers.length < cnt)
				//cnt = numbers.length;
			dfs(cnt, 0, numbers);

			// 3. ��� ���
			System.out.printf("#%d %d%n", test_case, result);

		}

	}

	// 4. dfs �Լ�
	public static void dfs(int cnt, int start, char[] numbers) {

		// 4-1. ���� ����
		if (cnt == 0) {
			int current = charArrToInt(numbers);
			if (current > result) {
				result = current;
			}
			return;
		}

		// 4-2. ��ȯ ����
		for (int i = start; i < numbers.length - 1; ++i) {
			for (int j = i + 1; j < numbers.length; ++j) {
				int src = numbers[i]-'0';
				int trg = numbers[j]-'0';

				numbers[i] = (char) (trg + '0');
				numbers[j] = (char) (src + '0');
				dfs(cnt - 1, i, numbers);
				numbers[i] = (char) (src + '0');
				numbers[j] = (char) (trg + '0');

			}
		}

	}

	// 5. char array to int
	public static int charArrToInt(char[] numbers) {
		return Integer.parseInt(new String(numbers));
	}

}