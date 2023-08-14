//package Striver_CP_Sheet;

import java.util.Scanner;

public class ErasingZeroes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int take = scan.nextInt();
        while (take-- > 0) {

            String str = scan.next();
            int pre = -1;
            int ans=0;
            for(int i = 0; i<str.length();i++) {
                if(str.charAt(i)=='1') {
                    if(pre!=-1) ans += i-pre-1;
                    pre = i;

                }

            }
            System.out.println(ans);
        }
    }
}
