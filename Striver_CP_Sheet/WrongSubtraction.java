package Striver_CP_Sheet;

import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        while (count != n){
            if(k % 10 == 0){
                k = k / 10;
                count++;
            }else{
                k = k - 1;
                count++;
            }
        }
        System.out.println(k);
    }
}
