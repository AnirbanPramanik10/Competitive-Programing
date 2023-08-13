package Striver_CP_Sheet;

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int LimakWeight = sc.nextInt();
        int BobWeight = sc.nextInt();
        int year = 0;

        while(LimakWeight <= BobWeight){
            LimakWeight = LimakWeight * 3;
            BobWeight = BobWeight * 2;
            year++;
        }
        System.out.println(year);
    }
}
