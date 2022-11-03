package baekjoon.silver;

import java.util.Scanner;

public class bj_10158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int t = sc.nextInt();
        
        int temp=0;

        int x, y;
        x = y = 1;

        for(int i=0;i<t;i++){
            if(p+x>=0&&p+x<=w&&q+y>=0&&q+y<=h){
                p+=x;
                q+=y;
            }
            else{
                
            }
        }
        
        sc.close();
    }
}
