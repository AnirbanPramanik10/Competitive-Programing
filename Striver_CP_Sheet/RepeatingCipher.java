//package Striver_CP_Sheet;

import java.util.Scanner;

public class RepeatingCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int j = 1;
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i += j){
            str.append(s.charAt(i));
            j++;
        }
        System.out.println(str);
    }
}
