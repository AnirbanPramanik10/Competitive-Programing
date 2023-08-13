package PracticeCF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str  = "";
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) == str2.charAt(i)){
                str = str + "0";
            }else str = str + "1";
        }
        System.out.println(str);
    }
}
