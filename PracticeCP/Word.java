package PracticeCF;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int Lower = 0;
        int Upper = 0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z')Upper++;
            if (ch >= 'a' && ch <= 'z')Lower++;
        }
        if(Lower > Upper) System.out.println(s.toLowerCase());
        if(Upper > Lower) System.out.println(s.toUpperCase());
        if(Lower == Upper) System.out.println(s.toLowerCase());

    }
}
