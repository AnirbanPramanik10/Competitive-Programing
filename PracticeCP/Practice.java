package PracticeCF;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        System.out.println(finder(x));
    }
    private static long finder(long x){
        String s = String.valueOf(x);
        StringBuilder str = new StringBuilder();

        for (int i =0;i<s.length();i++){
            long digit = Character.getNumericValue(s.charAt(i));
            if(digit >= 5 && !(i == 0 && digit == 9)){
                digit = 9 - digit;
            }
            str.append(digit);
        }
        return Long.parseLong(str.toString());
    }
}
