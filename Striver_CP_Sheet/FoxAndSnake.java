package Striver_CP_Sheet;

import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] table = new char[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                table[i][j] = '.';
            }
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    table[i][j] = '#';
                }
            } else {
                if ((i / 2) % 2 == 0) {
                    table[i][m - 1] = '#';
                } else {
                    table[i][0] = '#';
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }
}
