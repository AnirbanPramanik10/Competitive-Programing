package PracticeCF;

import java.util.Scanner;

public class CodeProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //No. of problems
        int count = 0;
        while (n-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 1 && b == 1 || a == 1 && c == 1 || b == 1 && c == 1) {
                count++;
            } else continue;
        }
        System.out.println(count);
    }
}
