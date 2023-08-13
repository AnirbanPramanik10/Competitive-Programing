//package PracticeCF;

import java.util.Scanner;

public class BuYaShovel {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int k = scanner.nextInt();
            int r = scanner.nextInt();

            int shovels = 1;
            while ((k * shovels - r) % 10 != 0 && (k * shovels) % 10 != 0) {
                shovels++;
            }

            System.out.println(shovels);
        }
    }

