package baekjoon.silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bj_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList <String> arr = new ArrayList<>();
        for(int i=0;i<t;i++){
            arr.add(sc.nextLine());
        }
        Collections.sort(arr);
        System.out.println("========================");
        System.out.println(arr.get(0));
        for(int i=1;i<t;i++){
            if(!arr.get(i).equals(arr.get(i-1)))
                System.out.println(arr.get(i));
        }
    }
}
