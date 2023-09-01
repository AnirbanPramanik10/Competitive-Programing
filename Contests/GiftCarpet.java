//package Contests;
import java.util.Scanner;
import java.util.ArrayList;

public class GiftCarpet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();

        while (testCases-- > 0) {
            int numRows = input.nextInt() , numCols = input.nextInt();
            ArrayList<String> rowsData = new ArrayList<>();

            for (int i = 0; i < numRows; i++) rowsData.add(input.next());


            ArrayList<String> colsData = new ArrayList<>();

            for (int i = 0; i < numCols; i++) {
                StringBuilder columnData = new StringBuilder();
                for (int j = 0; j < numRows; j++) {
                    columnData.append(rowsData.get(j).charAt(i));
                }
                colsData.add(columnData.toString());
            }

            String pattern = "vika";
            boolean result = checkPattern(colsData, pattern);

            if (result) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static boolean checkPattern(ArrayList<String> data, String pattern) {
        int patternIndex = 0;
        for (String column : data) {
            if (column.indexOf(pattern.charAt(patternIndex)) != -1) patternIndex++;
            if (patternIndex == 4) return true;
        }
        return false;
    }
}


//Given Input
//5 No. of test cases
//        1 4 ------> 1
//        vika
//        3 3------> 2
//        bad
//        car
//        pet
//        4 4------> 2
//        vvvv
//        iiii
//        kkkk
//        aaaa
//        4 4------> 2
//        vkak
//        iiai
//        avvk
//        viaa
//        4 7------> 2
//        vbickda
//        vbickda
//        vbickda
//        vbickda

//Output should be
//YES
//NO
//YES
//NO
//YES

