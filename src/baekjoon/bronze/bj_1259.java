package baekjoon.bronze;

import java.util.Scanner;

public class bj_1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ck = true;
        while (true) {
            ck = true;
            String str = sc.nextLine();
            if (str.equals("0"))
                return;
            char[] arr = str.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr[arr.length - i - 1])
                    ck = false;
            }
            if (ck)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
