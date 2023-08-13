//package Striver_CP_Sheet;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxPass = 0;
        int res = 0;

        for(int i=1;i<=n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            res -= a;
            res += b;
            maxPass = Math.max(maxPass,res);
        }
        System.out.println(maxPass);
    }
}
