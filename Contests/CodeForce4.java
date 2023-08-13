package Contests;

import java.util.Arrays;
import java.util.Scanner;

public class CodeForce4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(); // Number of problems
            int k = sc.nextInt(); // Maximum allowed absolute difference
            int[] problems = new int[n];

            for (int i = 0; i < n; i++) {
                problems[i] = sc.nextInt();
            }

            int minProblemsToRemove = findMinProblemsToRemove(problems, k);
            System.out.println(minProblemsToRemove);
        }
    }

    private static int findMinProblemsToRemove(int[] problems, int k) {
        Arrays.sort(problems);

        int minProblemsToRemove = problems.length - 1;
        for (int i = 0; i < problems.length; i++) {
            int right = upperBound(problems, i, problems[i] + k);

            int subsequenceLength = right - i + 1;

            minProblemsToRemove = Math.min(minProblemsToRemove, problems.length - subsequenceLength);
        }
        return minProblemsToRemove;
    }

    private static int upperBound(int[] arr, int start, int target) {
        int left = start;
        int right = arr.length - 1;
        int result = arr.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= target) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
