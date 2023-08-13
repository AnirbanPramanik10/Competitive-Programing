package Striver_CP_Sheet;

import java.util.Arrays;
import java.util.Scanner;

public class TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();

        int arr[] = new int[3];
        arr[0] = x1;
        arr[1] = x2;
        arr[2] = x3;

        Arrays.sort(arr);

        System.out.println((arr[1] - arr[0]) + (arr[2] - arr[1]));
    }
}



//import java.util.Scanner;
//public class The_New_Year_Meeting_Friends {
//    public static void main(String[] args) {
//
//        Scanner scan= new Scanner(System.in);
//        int x1 = scan.nextInt();
//        int x2 = scan.nextInt();
//        int x3 = scan.nextInt();
//
//        // Logic
//        // (x2-x1) + (x3-x2) = total minimum distance
//        // =) x2-x1+x3-x2 = total maximum distance
//        // =) x3 - x1 = total minimum distance (here x3 is max distance ans x1 is min distance)
//
//        System.out.println((Math.max(x1,Math.max(x2,x3)))-(Math.min(x1,Math.min(x2,x3))));
//    }
//}