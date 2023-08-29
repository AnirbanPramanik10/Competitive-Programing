//package Striver_CP_Sheet;

import java.util.Scanner;

public class Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int presses = n;
        for (int i = 1; i < n; i++) {
            presses += (n-i)*i;
        }
        System.out.println(presses);
    }
}

