package PracticeCF;

import java.util.Scanner;

public class HitTheLottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count = 0;
        while(n != 0){
            if(n >= 100){
                n = n - 100;
                count++;
            }
            else if(n >=20){
                n = n - 20;
                count++;
            }
            else if(n >= 10){
                n = n - 10;count++;
            }
            else if(n >= 5){
                n = n - 5;count++;
            }
            else if(n >= 1){
                n = n - 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
