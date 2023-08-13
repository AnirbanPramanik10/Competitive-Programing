//package Striver_CP_Sheet;

import java.util.HashMap;
import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), temp;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            temp = sc.nextInt();
            map.put(temp, i);
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(map.get(i) + " ");
        }
    }
}


/////////////////////////////////////////
//
//        int arr[] = new int[n+1];
//        for(int i=1;i<=n;i++){
//            temp = sc.nextInt();
//            arr[temp] = i;
//        }
//        for(int i=1;i<=n;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//}
//////////////////////////////////////////