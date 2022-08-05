package baekjoon.bronze;

import java.util.Scanner;

public class bj_1193 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x = sc.nextInt();
		int y;
		int count = 1;
		while(x>count) {
			x-=count;
			count++;
		}
		y = count-x+1;
		if(count%2==0)
			System.out.println(x+"/"+y);
		else
			System.out.println(y+"/"+x);
	}

}
