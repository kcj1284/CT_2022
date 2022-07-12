package programers;

public class prgms_prime {

	public static int answer;

	public int solution(int[] nums) {
		answer = 0;
		dfs(nums);
		return answer;
	}

	public static void dfs(int arr[]) {
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					int prime[] = new int[3];
					prime[0] = arr[i];
					prime[1] = arr[j];
					prime[2] = arr[k];
					if (primeck(arrtoint(prime)))
						answer++;
				}
			}
		}
	}

	public static int arrtoint(int arr[]) {
		int len = arr.length;
		int result = 0;
		for (int i = 0; i < len; i++) {
			result = result * 10 + arr[i];
		}
		return result;
	}

	public static boolean primeck(int num) {
		boolean T = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return T;
	}
}
