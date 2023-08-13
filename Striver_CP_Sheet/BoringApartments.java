//package Striver_CP_Sheet;

import java.util.Scanner;

public class BoringApartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String s = sc.next();
            int n = s.length();
            int x = Integer.parseInt(String.valueOf(s.charAt(0)));
            int ans = 10 * (x - 1) ;
            while(n > 0){
                ans = ans + n--;
            }
            System.out.println(ans);
        }
    }
}
