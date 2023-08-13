package Contests;

import java.util.Scanner;

public class EscalatorConversations {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int testcase = scann.nextInt();
        while (testcase-- > 0) {
            int num = scann.nextInt();
            int mSteps = scann.nextInt();
            int kHeight = scann.nextInt();
            int Hcentimeters = scann.nextInt();
            int countOfConv = 0;

            int[] heightsOfPeople = new int[num];
            for (int i = 0; i < num; i++) heightsOfPeople[i] = scann.nextInt();

            for (int i = 0; i < num; i++) {
                if (heightsOfPeople[i] != Hcentimeters && Math.abs(heightsOfPeople[i] - Hcentimeters) % kHeight == 0) {
                    int stepsApart = Math.abs(heightsOfPeople[i] - Hcentimeters) / kHeight;
                    if (stepsApart < mSteps)countOfConv++;
                }
            }
            System.out.println(countOfConv);
        }
    }
}
