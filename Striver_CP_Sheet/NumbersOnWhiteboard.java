//package Striver_CP_Sheet;

import java.util.Scanner;

public class NumbersOnWhiteboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            System.out.println(2);
            System.out.println(n +" "+ (n-1));
            int x = n, y = n-2;
            while (x >= 3 && y >= 1){
                System.out.println(x +" "+ y);
                x--;
                y--;
            }
        }
    }
}
