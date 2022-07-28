package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_1253 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		int count = 0;
		int str, end;
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		for (int i = 0; i < N; i++) {
			str = 0;
			end = N - 1;
			while (str < end) {
				if (arr[str] + arr[end] == arr[i]) {
					if (str != i && end != i) {
						count++;
						break;
					} else if (str == i)
						str++;
					else
						end--;

				} else if (arr[str] + arr[end] > arr[i])
					end--;
				else
					str++;
			}
		}
		System.out.println(count);
		br.close();
	}

}
