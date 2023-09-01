//package Contests;

import java.util.Scanner;

public class FlowerCityFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            solveTestCase(sc);
        }
    }

    public static void solveTestCase(Scanner sc) {
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; ++i) {
            array[i] = sc.nextInt();
        }

        if (hasInvalidElements(array, arraySize)) {
            System.out.println("NO");
            return;
        }
        int[] prefixSum = calculatePrefixSum(array, arraySize);

//        boolean isPossible = checkPrefixSumEquality(array, prefixSum, arraySize);
        System.out.println(checkPrefixSumEquality(array, prefixSum, arraySize) ? "YES" : "NO");
    }
    public static boolean checkPrefixSumEquality(int[] array, int[] prefixSum, int size) {
        for (int i = 0; i < size; ++i) if (prefixSum[i] != array[i]) return false;
        return true;
    }

    public static boolean hasInvalidElements(int[] array, int size) {
        int maxAllowedValue = size;
        for (int val : array) {
            if (val > maxAllowedValue) return true;
        }
        return false;
    }

    public static int[] calculatePrefixSum(int[] array, int size) {
        int[] prefixSum = new int[size + 1];
        for (int i = 0; i < size; ++i) {
            prefixSum[0]++;
            prefixSum[array[i]]--;
        }

        int sum = 0;
        for (int i = 0; i < size; ++i) {
            sum += prefixSum[i];
            prefixSum[i] = sum;
        }
        return prefixSum;
    }


}

// Inputs
//7 ----> No. of testcases

//5 -----> 1
//5 4 3 2 1
//3 -----> 1
//3 1 1
//3 -----> 1
//4 2 1
//1 -----> 1
//2
//5 -----> 1
//5 3 3 1 1
//5 -----> 1
//5 5 5 3 3
//2 -----> 1
//6 1

//Outputs

//YES
//YES
//NO
//NO
//YES
//YES
//NO