//package PracticeCF;

import java.util.Scanner;

public class SquareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String str = sc.next();
            int  half = str.length() / 2;
            String str1 = str.substring(0,half);
            String str2 = str.substring(half,str.length());
            if(str.length() % 2 != 0) System.out.println("NO");
            else if(str1.equals(str2)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}

