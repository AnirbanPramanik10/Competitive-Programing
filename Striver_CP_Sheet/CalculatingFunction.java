package Striver_CP_Sheet;

import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        if(n % 2 == 0) System.out.println(n / 2);
        else{
            ans = -(n/2 + 1);
            System.out.print(ans);
        }
    }
}
