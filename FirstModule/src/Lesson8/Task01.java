package Lesson8;

import java.util.Scanner;

/**
 * Created by Marina on 20.6.2017 г..
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = "";
        String secondString = "";
        do {
            System.out.println("Enter a string up to 40 symbols:");
            firstString = scanner.next();
            System.out.println("Enter a second string up to 40 symbols: ");
            secondString = scanner.next();
        } while (firstString.length() <= 40 && secondString.length() <= 40);

        firstString = firstString.toLowerCase();
        System.out.println("First string to lower: " + firstString);
        firstString = firstString.toUpperCase();
        System.out.println("First string to upper: " + firstString);
        secondString = secondString.toLowerCase();
        System.out.println("Second string to lower: " + secondString);
        secondString = secondString.toUpperCase();
        System.out.println("Second string to upper: " + secondString);
    }
}

