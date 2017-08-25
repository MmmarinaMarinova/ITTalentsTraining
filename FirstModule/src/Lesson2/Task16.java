package Lesson2;

import java.util.Scanner;

/**
 * Created by Marina on 1.6.2017 г..
 */
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int a = number / 100;
        int b = number / 10 % 10;
        int c = number % 10;

        if (number > 99 && number < 1000) {
            if (a == b && b == c) {
                System.out.println("The digits are equal");
            } else if (a > b && b > c) {
                System.out.println("The digits are ordered in descending order");
            } else if (a < b && b < c) {
                System.out.println("The digits are ordered in ascending order");
            } else {
                System.out.println("The numbers are not ordered");
            }
        }


    }
}
