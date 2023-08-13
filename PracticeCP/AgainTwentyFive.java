package PracticeCF;

import java.util.Scanner;

public class AgainTwentyFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        if(n > 1)System.out.println("25");
        if(n == 1) System.out.println("05");
        if(n == 0) System.out.println("01");
    }
}
