package PracticeCF;

import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String s1 = "I hate";
            String s2 = "I love";
            String s3 = "that";
            StringBuilder str = new StringBuilder();
            for(int i=1;i<=n;i++){
                if(i == 1)str.append(s1);
                else{
                    if(i % 2 == 0){
                        str.append(" " + s3 +" "+ s2);
                    }else {
                        str.append(" " + s3 + " " + s1);
                    }
                }
            }
        System.out.print(str + " it");
    }
}
