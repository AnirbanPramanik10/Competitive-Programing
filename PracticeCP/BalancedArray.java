package PracticeCF;

import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0){
            int n = sc.nextInt();
            int half = n/2;
            if(half % 2 == 1){
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            for (int i = 1; i <= half; i++) {
                System.out.print(i*2 + " ");
            }

            for (int i = 1; i <half; i++) {
                System.out.print((i*2)-1 + " ");
            }
            System.out.println(3*half-1);
        }
    }
}
