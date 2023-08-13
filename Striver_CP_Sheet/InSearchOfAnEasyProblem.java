package Striver_CP_Sheet;

import java.util.ArrayList;
import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(arr[i]);
        }
        if(list.contains(1)) System.out.println("HARD");
        else System.out.println("EASY");
    }
}
