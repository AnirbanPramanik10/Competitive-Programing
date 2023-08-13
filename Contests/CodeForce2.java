package Contests;

import java.util.Scanner;

public class CodeForce2 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int testcase = scann.nextInt();
        for (int i = 0; i < testcase; i++) {
            int n = scann.nextInt();
            int maxQ = 0;
            int winnerIdx = -1;
            for (int j = 0; j < n; j++) {
                int w = scann.nextInt();
                int q = scann.nextInt();
                if (w <= 10 && q > maxQ) {
                    maxQ = q;
                    winnerIdx = j + 1;
                }
            }
            System.out.println(winnerIdx);
        }
    }
}
