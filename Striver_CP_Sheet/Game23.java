//package Striver_CP_Sheet;

import java.util.Scanner;

public class Game23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int moves = solve(n, m);
        System.out.println(moves);
    }
    public static int solve(int n, int m) {
        if (m % n != 0) {
            return -1;
        }

        int result = 0;
        int factor = m / n;

        while (factor % 2 == 0) {
            factor /= 2;
            result++;
        }
        while (factor % 3 == 0) {
            factor /= 3;
            result++;
        }

        if (factor == 1) {
            return result;
        } else {
            return -1;
        }
    }
}
