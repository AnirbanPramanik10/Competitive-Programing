//package PracticeCF;

import java.util.Scanner;

public class SpyDetected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n =sc.nextInt();
            int arr[] = new int[n];
            for (int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (count == 1) System.out.println(i + 1);
            }
        }
    }
}
