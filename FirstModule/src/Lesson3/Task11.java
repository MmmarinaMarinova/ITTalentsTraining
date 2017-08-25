package Lesson3;

import java.util.Scanner;

/**
 * Created by Marina on 8.6.2017 г..
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int spaces = height - 1;
        int stars = 1;
        int outerSpaces = height - 1;
        int innerSpaces = 1;


        for (int i = 0; i < height; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            stars += 2;
        }

        System.out.println();


        /***************************************/
        // 3 cases-if it is last, first or middle row:
        for (int i = 0; i < height; i++) {
            if (i == height - 1) {
                for (int j = 0; j < 2 * height - 1; j++) {
                    System.out.print("*"); //prints only stars for the last row
                }
            } else if (i == 0) {
                for (int j = 0; j < outerSpaces; j++) {
                    System.out.print(" ");
                }
                System.out.print("*"); //prints only one star on the top
                System.out.println();
            } else {
                for (int j = 0; j < outerSpaces; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");

                for (int j = 0; j < innerSpaces; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
                innerSpaces += 2;
            }

            outerSpaces--;

        }
    }
}

