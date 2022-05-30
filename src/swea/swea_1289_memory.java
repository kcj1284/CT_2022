package swea;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

class swea_1289_memory {

	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("res/1289.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			String str = sc.next();
			int count =0;
			boolean t = false;
			char [] mem = str.toCharArray();
			for(int i=0;i<mem.length;i++) {
				if(!t&&mem[i]=='1') {
					count++;
					t = true;
				}
				if(t&&mem[i]=='0') {
					count++;
					t = false;
				}
			}

			System.out.printf("#%d %d%n", test_case,count);
		}
	}

}
