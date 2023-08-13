package Contests;

import java.util.Scanner;

public class CodeForce3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        scanner.nextLine();
        while (testcase-- > 0) {
            char[][] grid = new char[8][8];
            for (int i = 0; i < 8; i++) {
                String line = scanner.nextLine();
                grid[i] = line.toCharArray();
            }
            String word = findVerticalWord(grid);
            System.out.println(word);
        }
    }
    private static String findVerticalWord(char[][] grid) {
        StringBuilder wordBuilder = new StringBuilder();

        for (int col = 0; col < 8; col++) {
            for (int row = 0; row < 8; row++) {
                if (grid[row][col] != '.') {
                    wordBuilder.append(grid[row][col]);
                }
            }
        }

        return wordBuilder.toString();
    }
}
