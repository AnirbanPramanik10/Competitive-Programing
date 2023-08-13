package Striver_CP_Sheet;

import java.util.Scanner;

public class ChewbaccaNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        System.out.println(findMinimumNumber(x));
    }

    public static long findMinimumNumber(long x) {
        String strX = String.valueOf(x);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strX.length(); i++) {
            int digit = Character.getNumericValue(strX.charAt(i));

            if (digit >= 5 && !(i == 0 && digit == 9)) {
                digit = 9 - digit;
            }
            result.append(digit);
        }
        return Long.parseLong(result.toString());
    }
}
