//package Striver_CP_Sheet;

import java.util.Scanner;

public class FixYou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            scanner.nextLine();

            char[][] grid = new char[n][m];

            for (int i = 0; i < n; i++) {
                String row = scanner.nextLine();
                for (int j = 0; j < m; j++) {
                    grid[i][j] = row.charAt(j);
                }
            }

            int changes = 0;

            for (int i = 0; i < n - 1; i++) {
                if (grid[i][m - 1] == 'R') {
                    changes++;
                }
            }
            for (int j = 0; j < m - 1; j++) {
                if (grid[n - 1][j] == 'D') {
                    changes++;
                }
            }

            System.out.println(changes);
        }
    }
}
