package Lesson2;

import java.util.Scanner;

/**
 * Created by Marina on 1.6.2017 г..
 */
public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();

        if (hour <= 24 && hour >= 0) {
            if (hour > 4 && hour <= 9) {
                System.out.println("Good morning!");
            } else if (hour > 9 && hour <= 18) {
                System.out.println("Good afternoon!");
            } else if ((hour > 18 && hour <= 24) || (hour >= 0 && hour <= 4)) {
                System.out.println("Good evening!");
            }
        } else {
            System.out.println("This is not a valid hour!");
        }


    }
}
