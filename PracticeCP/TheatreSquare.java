package PracticeCF;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long res = 0;
        res += (Math.ceil(1.0 * n/a)) * Math.ceil(1.0 * m/a);
        System.out.println(res);
    }
}
