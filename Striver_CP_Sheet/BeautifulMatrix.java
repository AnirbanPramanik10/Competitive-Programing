package Striver_CP_Sheet;

import java.util.*;

public class BeautifulMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[5][5];

        int count = 0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] == 1){
                     count = Math.abs(2-i) + Math.abs(2-j);
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
