//package Striver_CP_Sheet;

import java.util.Scanner;
import java.util.HashMap;
public class KString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        String s = scanner.next();

        String result = rearrangeToKString(k, s);
        System.out.println(result);
    }

    public static String rearrangeToKString(int k, String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : charCount.keySet()) {
            int count = charCount.get(c);
            if (count % k != 0) {
                return "-1";
            }
        }

        StringBuilder kString = new StringBuilder();
        for (char c : charCount.keySet()) {
            int count = charCount.get(c);
            for (int i = 0; i < count / k; i++) {
                kString.append(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++) {
            result.append(kString);
        }

        return result.toString();
    }
}
