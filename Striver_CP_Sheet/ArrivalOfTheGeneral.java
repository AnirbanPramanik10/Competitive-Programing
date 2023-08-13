package Striver_CP_Series;

import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxV = 0, minV = 101, minI = 0, maxI = 0;

        for(int i=0;i<n;i++){
            int j = sc.nextInt();
            if(j > maxV){
                maxV = j;
                maxI = i;
            }
            if(j <= minV){
                minV = j;
                minI = i;
            }
        }

        if(maxI > minI) System.out.println((maxI - 1) + (n - minI) - 1);
        else System.out.println((maxI - 1) + (n - minI));
    }
}
