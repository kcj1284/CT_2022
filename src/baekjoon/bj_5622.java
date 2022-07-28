package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_5622 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] alpha = { "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
		String st = br.readLine();
		int sum = 0;
		for (int i = 0; i < st.length(); i++) {
			for (int j = 0; j < alpha.length; j++) {
				if (alpha[j].contains("" + st.charAt(i))) {
					sum += 3 + j;
				}
			}
		}
		bw.write(sum + "");
		bw.close();
		br.close();

	}

}
