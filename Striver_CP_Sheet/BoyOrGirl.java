package Striver_CP_Sheet;

import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(String.valueOf(str.charAt(i)));
        }
        if(set.size() % 2 == 0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}
