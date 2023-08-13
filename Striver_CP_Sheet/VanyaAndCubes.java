//package Striver_CP_Sheet;

import java.util.Scanner;

public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int i = 0;

        while (i <= n) {
            count++;
            i += count * (count + 1) / 2;
        }
        System.out.println(count - 1);
    }
}
