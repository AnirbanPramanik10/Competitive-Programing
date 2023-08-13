package Striver_CP_Sheet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumofRoundNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            List<Integer> roundNumbers = new ArrayList<>();

            String strN = String.valueOf(n);
            int len = strN.length();

            for (int i = 0; i < len; i++) {
                int digit = strN.charAt(i) - '0';
                if (digit > 0) {
                    int roundNumber = digit * (int) Math.pow(10, len - i - 1);
                    roundNumbers.add(roundNumber);
                }
            }

            System.out.println(roundNumbers.size());
            for (int roundNumber : roundNumbers) {
                System.out.print(roundNumber + " ");
            }
            System.out.println();
        }
    }
}
