package Striver_CP_Sheet;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

            if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'){
                System.out.println(str);
            }else{
                String fl = str.substring(0,1);
                str = fl.toUpperCase() + str.substring(1,str.length());
                System.out.println(str);
        }
    }
}
