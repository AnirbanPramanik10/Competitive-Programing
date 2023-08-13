package PracticeCF;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }

        int count = 0;
        for(int i=0;i<n;i++){
            if(array[i] >= array[k-1] && array[i] > 0)count++;
        }
        System.out.println(count);
    }
}


