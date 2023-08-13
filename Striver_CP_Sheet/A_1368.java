//package Striver_CP_Sheet;

import java.util.Scanner;

public class A_1368 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int count = 0;

            while(a <= n && b <= n){
               if(a < b){
                   a += b;
               }else {
                   b += a;
               }
                count++;
            }
            System.out.println(count);
        }
    }
}
