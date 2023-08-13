//package PracticeCF;

import java.util.Scanner;
import java.util.ArrayList;
public class DislikeOfThrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int k = sc.nextInt();
            ArrayList<Integer> sequence = new ArrayList<>();
            int num = 1;

            while (sequence.size() < k) {
                if (num % 3 != 0 && num % 10 != 3) {
                    sequence.add(num);
                }
                num++;
            }
            System.out.println(sequence.get(k - 1));
        }
    }
}
