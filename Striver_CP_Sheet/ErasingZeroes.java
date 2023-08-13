package Striver_CP_Sheet;

import java.util.Scanner;

public class ErasingZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String s = sc.nextLine();
            int onesCount = 0;
            int deletionsNeeded = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    onesCount++;
                } else if (onesCount > 0) {
                    deletionsNeeded++;
                }
            }

            System.out.println(deletionsNeeded);
        }
    }
}
