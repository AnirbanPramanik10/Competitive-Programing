package Contests;

import java.util.Scanner;

public class AnotherPermutationProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long maxCost = solvePermutationCost(n);
            System.out.println(maxCost);
        }
    }

    public static long solvePermutationCost(long n) {
        long Result = 0;

        for (int i = 1; i <= n; i++) {
            long answer = 0, mx = 0;

            for (int j = 1; j < i; j++) {
                answer += j * j;
                mx = Math.max(mx, j * j);
            }
            long x = n;
            for (int j = i; j <= n; j++) {
                answer += j * x;
                mx = Math.max(mx, j * x);
                x--;
            }
            answer -= mx;
            Result = Math.max(Result, answer);
        }
        return Result;
    }
}