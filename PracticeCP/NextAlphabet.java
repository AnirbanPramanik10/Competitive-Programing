package PracticeCF;

import java.util.Scanner;

public class NextAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int nextChar = ch + 1;
        if(ch == 'z')nextChar = 97;
        System.out.println((char)nextChar);
    }
}
