package Striver_CP_Sheet;

import java.util.Scanner;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int res = 1;
        int count = 1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] < arr[i+1])count++;
            else count = 1;
            res = Math.max(count,res);
        }
        System.out.println(res);
    }
}
