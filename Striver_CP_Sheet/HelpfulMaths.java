package Striver_CP_Sheet;

import java.util.Scanner;
import java.util.*;
public class HelpfulMaths {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String sum = scanner.next();
            String rearrangedSum = rearrangeSum(sum);
            System.out.println(rearrangedSum);
        }

        public static String rearrangeSum(String sum) {
            List<Integer> numbers = new ArrayList<>();

            for (int i = 0; i < sum.length(); i += 2) {
                int num = Character.getNumericValue(sum.charAt(i));
                numbers.add(num);
            }

            Collections.sort(numbers);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < numbers.size(); i++) {
                sb.append(numbers.get(i));
                if (i < numbers.size() - 1) {
                    sb.append("+");
                }
            }

            return sb.toString();
        }
}
