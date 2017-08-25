package Lesson3;

import java.util.Scanner;

/**
 * Created by Marina on 8.6.2017 г..
 */
public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int currNum = 0;
        int newNumber = 0;
        int initialValue = 0;

        do {
            System.out.println("Please enter a number between 10 and 30 000: ");
            number = scanner.nextInt();
        } while (number < 10 || number > 30000);

        initialValue = number;
        do {
            currNum = number % 10;
            newNumber = (newNumber * 10) + currNum;
            number = number / 10;
        } while (number > 0);

        if (newNumber == initialValue) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}
