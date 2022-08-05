package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_10986 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		long[] arr = new long[n];
		long[] mod = new long[m];
		int count = 0;
		st = new StringTokenizer(br.readLine());
		arr[0] = Integer.parseInt(st.nextToken());

		for (int i = 1; i < n; i++) {
			arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < n; i++) {
			int temp = (int)(arr[i] % m);
			if (temp == 0)
				count++;
			mod[temp]++;
		}

		for (int i = 0; i < m; i++) {
			//if (mod[i] > 1) 
				count += (int)(mod[i] * (mod[i] - 1)) / 2;
		}

		bw.write(count + "");
		bw.flush();
		br.close();
	}
}