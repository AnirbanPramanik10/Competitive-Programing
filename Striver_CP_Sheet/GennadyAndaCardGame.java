package Striver_CP_Sheet;

import java.util.Scanner;

public class GennadyAndaCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String s4 = sc.next();
        String s5 = sc.next();

        if(s.charAt(0) == s1.charAt(0) || s.charAt(0) == s2.charAt(0) || s.charAt(0) == s3.charAt(0) || s.charAt(0) == s4.charAt(0) || s.charAt(0) == s5.charAt(0) || s.charAt(1) == s1.charAt(1) || s.charAt(1) == s2.charAt(1) || s.charAt(1) == s3.charAt(1) || s.charAt(1) == s4.charAt(1) || s.charAt(1) == s5.charAt(1))
            System.out.println("YES");
        else System.out.println("NO");
    }
}
