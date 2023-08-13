//package Striver_CP_Sheet;

import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kFirstBanana = sc.nextInt();
        int nDollars = sc.nextInt();
        int wBananas = sc.nextInt();

        int totalCost = 0;
        for(int i=1;i<=wBananas;i++){
            totalCost += (i * kFirstBanana);
        }
        if(totalCost - nDollars < 0) System.out.println(0);
        else System.out.println(totalCost - nDollars);
    }
}
