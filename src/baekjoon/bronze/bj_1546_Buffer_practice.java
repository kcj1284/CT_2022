package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_1546_Buffer_practice {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double max = 0;
        double[] score =new double[n];
        for(int i=0;i<n;i++){
            score[i] = Double.parseDouble(st.nextToken());
            if(score[i] >max) max=score[i];
        }
        double sum=0;
        for(int i=0;i<n;i++){
            score[i] = (score[i]*100)/max;
            sum=sum+score[i];
        }
        bw.write(sum/n +"");
        bw.flush();
        br.close();
    }
}