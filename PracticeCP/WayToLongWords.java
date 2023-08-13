package PracticeCF;

import java.util.Scanner;

public class WayToLongWords {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(s.length() <= 10){
                System.out.println(s);
            }else{
                char fw = s.charAt(0);
                System.out.println(fw+String.valueOf(s.length() - 2)+s.charAt(s.length()-1));
            }
        }
    }
}
