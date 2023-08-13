package Striver_CP_Sheet;

import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int tDrinks = k * l / nl ;
        int tSlices = c * d;
        int tSalt = p / np ;
        int ans = Math.min(tDrinks,Math.min(tSlices,tSalt)) / n;
        System.out.println(ans);

    }
}
