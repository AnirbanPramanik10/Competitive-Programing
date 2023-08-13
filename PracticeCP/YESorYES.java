package PracticeCF;

import java.util.Scanner;

public class YESorYES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
            while (test-- > 0) {
                String str = sc.next();
                if((str.charAt(0) == 'Y' || str.charAt(0) == 'y') && (str.charAt(1) == 'E' || str.charAt(1) == 'e') && (str.charAt(2) == 'S' || str.charAt(2) == 's'))
                    System.out.println("YES");
                else System.out.println("NO");
        }
    }
}
