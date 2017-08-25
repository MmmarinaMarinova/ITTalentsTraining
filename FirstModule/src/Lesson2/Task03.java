package Lesson2;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 * Created by Marina on 1.6.2017 г..
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number A");
        int numA = scanner.nextInt();
        System.out.println("Enter a number B");
        int numB = scanner.nextInt();

        if (numA == numB) {
            System.out.println("The numbers should not be the same!");
        } else {
            int currNumber = numA;
            numA = numB;
            numB = currNumber;

            System.out.printf("The reverse values are: a=%d, b=%d", numA, numB);
        }


    }
}
