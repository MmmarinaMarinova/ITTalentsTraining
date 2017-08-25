package Lesson8;

import java.util.Scanner;

/**
 * Created by Marina on 20.6.2017 г..
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = "";
        String secondString = "";
        do {
            System.out.println("Enter two strings up to 20 symbols:");
            firstString = scanner.nextLine();
            secondString = scanner.nextLine();
        } while ((firstString.length() > 20 && firstString.length() < 5) ||
                (secondString.length() > 20 && secondString.length() < 5));

        String resultString1 = firstString.substring(0, 5) + secondString.substring(5);
        String resultString2 = secondString.substring(0, 5) + firstString.substring(5);
        if (resultString1.length() >= resultString2.length()) {
            System.out.println("The length of the longer string is: " + resultString1.length());
        } else {
            System.out.println("The length of the longer string is: " + resultString2.length());
        }

        System.out.println(resultString1);
        System.out.println(resultString2);
    }
}
