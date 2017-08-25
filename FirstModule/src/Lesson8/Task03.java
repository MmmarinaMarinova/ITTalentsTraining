package Lesson8;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Marina on 20.6.2017 г..
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String firstString = scanner.next();
        String secondString = scanner.next();
        int minLength = 0;
        int maxLength = 0;
        if (firstString.length() > secondString.length()) {
            minLength = secondString.length();
            maxLength = firstString.length();
            System.out.println("The first string is longer");
        } else if (secondString.length() > firstString.length()) {
            minLength = firstString.length();
            maxLength = secondString.length();
            System.out.println("The second string is longer");
        } else {
            minLength = firstString.length();
            System.out.println("The two strings have equal length");
        }

        for (int i = 0; i < minLength; i++) {

            if (firstString.charAt(i) != secondString.charAt(i)) {
                System.out.println("Difference in the strings: " + i + ": " + firstString.charAt(i) + " " + secondString.charAt(i));
            }
        }

    }
}
