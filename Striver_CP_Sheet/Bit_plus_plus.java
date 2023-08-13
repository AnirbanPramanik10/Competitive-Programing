package Striver_CP_Sheet;

import java.util.Scanner;

public class Bit_plus_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = 0;

        for (int i=0;i<n;i++){
            String str = sc.next();
            if(str.equals("++X") || str.equals("X++")) X++;
            else X--;
        }
        System.out.println(X);
    }
}
