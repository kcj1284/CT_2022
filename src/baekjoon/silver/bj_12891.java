package baekjoon.silver;

import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

public class bj_12891 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int str = 0;
		int end = p-1;
		String pass = br.readLine();
		char c;
		int count = 0;
		st = new StringTokenizer(br.readLine());
		int[] need = new int[4];
		for (int i = 0; i < 4; i++) {
			need[i] = Integer.parseInt(st.nextToken());
		}
		int[] solve = new int[4];
		for (int i = 0; i < p; i++) {
			c = pass.charAt(i);
			if (c == 'A')
				solve[0]++;
			else if (c == 'C')
				solve[1]++;
			else if (c == 'G')
				solve[2]++;
			else if (c == 'T')
				solve[3]++;
		}
		str++;
		end++;
		for (int i : solve) {
			System.out.print(i + "\n");
		}
		System.out.println();
		if (solve[0] >= need[0] && solve[1] >= need[1] && solve[2] >= need[2] && solve[3] >= need[3]) {
			count++;
		}

		while (end < s) {

			c = pass.charAt(str - 1);
			if (c == 'A')
				solve[0]--;
			else if (c == 'C')
				solve[1]--;
			else if (c == 'G')
				solve[2]--;
			else if (c == 'T')
				solve[3]--;
			for (int i : solve) {
				System.out.print(i + "\n");
			}
			System.out.println();

			c = pass.charAt(end);
			if (c == 'A')
				solve[0]++;
			else if (c == 'C')
				solve[1]++;
			else if (c == 'G')
				solve[2]++;
			else if (c == 'T')
				solve[3]++;
			for (int i : solve) {
				System.out.print(i + "\n");
			}
			System.out.println();

			if (solve[0] >= need[0] && solve[1] >= need[1] && solve[2] >= need[2] && solve[3] >= need[3])
				count++;
			str++;
			end++;
		}
		
		System.out.println(count);
		br.close();
	}
}
