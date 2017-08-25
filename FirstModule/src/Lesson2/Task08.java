package Lesson2;

import java.util.Scanner;

/**
 * Created by Marina on 1.6.2017 г..
 */
public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int firstDigit = 0;
        int secondDigit = 0;
        int thirdDigit = 0;
        int fourthDigit = 0;

        if (number >= 1000 && number <= 9999) {
            fourthDigit = number % 10;
            thirdDigit = number / 10 % 10;
            secondDigit = number / 100 % 10;
            firstDigit = number / 1000;

            int firstNumber = firstDigit * 10 + fourthDigit;
            int secondNumber = secondDigit * 10 + thirdDigit;

            if (firstNumber > secondNumber) {
                System.out.println("First number is bigger than the second " + firstNumber + ">" + secondNumber);
            } else if (firstNumber < secondNumber) {
                System.out.println("Second number is bigger than the first " + firstNumber + "<" + secondNumber);
            } else {
                System.out.println("The two numbers are equal" + firstNumber + "=" + secondNumber);
            }
        } else {
            System.out.println("The number is not between 1000 and 9999!");
        }


    }


}
