import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class retry {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String member [][] = new String [n][2];
		for(int i=1;i<=n;i++) {
			String age = sc.next();
			String name = sc.next();
			member[i][0] = age;
			member[i][1] = name;
		}
		Arrays.sort(member,new Comparator<String []>() {
			public int compare(String s1[], String s2[]) {
				return Integer.valueOf(s1[0])-Integer.valueOf(s1[2]);
			}
		});
		for(int i=0;i<n;i++) {
			System.out.println(member[i][0]+" "+member[i][1]);	
		}
	}

}
