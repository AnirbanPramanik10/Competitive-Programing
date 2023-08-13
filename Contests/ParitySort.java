package Contests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ParitySort {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int test = scann.nextInt();
        while (test-- > 0) {
            int num = scann.nextInt();
            int[] nums = new int[num];
            for (int i = 0; i < nums.length; i++) nums[i] = scann.nextInt();

            ArrayList<Integer> list1 = new ArrayList<Integer>();ArrayList<Integer> list2 = new ArrayList<Integer>();ArrayList<Integer> list3 = new ArrayList<Integer>();ArrayList<Integer> list4 = new ArrayList<Integer>();

            for(int i=0;i<nums.length;i++){
                if (nums[i] % 2 == 0){
                    list1.add(i);
                    list3.add(nums[i]);
                }
                else{
                    list2.add(i);
                    list4.add(nums[i]);
                }
            }

            Collections.sort(list3);
            Collections.sort(list4);
            int n = list3.size() , m = list4.size();
            boolean isSorted = true;

            for(int i=0;i<n;i++)nums[list1.get(i)] = list3.get(i);
            for(int i=0;i<m;i++)nums[list2.get(i)] = list4.get(i);
            for(int i=0;i<num-1;i++) if(nums[i] > nums[i+1])isSorted = false;

            if (isSorted) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
