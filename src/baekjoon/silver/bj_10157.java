package baekjoon.silver;

import java.util.Scanner;

public class bj_10157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int r = sc.nextInt();
        int k = sc.nextInt();
        int x, y, temp, cnt;
        x = y = cnt = 1;
        temp = 0;
        if(c*r<k){
            System.out.println(0);
            return;
        }
        while(cnt<k){
            if(temp%4==0){
                r--;
                y+=r;
                //System.out.println("y : "+y);
                cnt=cnt+r;
                //System.out.println("cnt : "+cnt);
            }
            else if(temp%4==1){
                c--;
                x+=c;
                //System.out.println("x : "+x);
                cnt=cnt+c;
                //System.out.println("cnt : "+cnt);
            }
            else if(temp%4==2){
                if(temp!=2)
                    r--;
                y-=r;
                //System.out.println("y : "+y);
                cnt=cnt+r;
                //System.out.println("cnt : "+cnt);
            }
            else if(temp%4==3){
                c--;
                x-=c;
                //System.out.println("x : "+x);
                cnt=cnt+c;
                //System.out.println("cnt : "+cnt);
            }
            temp++;
        }
        if(cnt==k){
            System.out.println(x+" "+y);
        }
        else{
            temp--;
            if(temp%4==0){
                y-=(cnt-k);
            }
            else if(temp%4==1){
                x-=(cnt-k);
            }
            else if(temp%4==2){
                y+=(cnt-k);
            }
            else if(temp%4==3){
                x+=(cnt-k);
            }
            System.out.println(x+" "+y);
        }
    }
}
