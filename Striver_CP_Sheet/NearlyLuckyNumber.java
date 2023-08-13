package Striver_CP_Sheet;

import java.util.HashSet;
import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int count =0;
        String str = sc.next();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '4' || str.charAt(i) == '7')count++;
        }
        if(count == 4 || count == 7) System.out.println("YES");
        else System.out.println("NO");

    }
}
