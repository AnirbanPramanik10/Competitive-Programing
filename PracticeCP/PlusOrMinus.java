package PracticeCF;

import java.util.Scanner;

public class PlusOrMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a + b == c) System.out.println("+");
            if(a - b == c) System.out.println("-");
        }
    }
}
