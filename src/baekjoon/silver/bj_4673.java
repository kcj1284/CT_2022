package baekjoon.silver;

public class bj_4673 {
	static boolean[] arr = new boolean[10000];

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10000; i++) {
			check(i);
		}
		
		for(int i=0;i<arr.length;i++) {
			if(!arr[i])
				System.out.println(i+1);
		}
	}

	static void check(int num) {
		int temp1 = num;
		int temp2 = num;
		while(temp2>0) {
			temp1 +=temp2%10;
			temp2 /=10;
		}
		if(temp1-1<10000)
			arr[temp1-1] = true;
	}
}
