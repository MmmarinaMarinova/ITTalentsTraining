package Lesson2;

import java.nio.Buffer;
import java.util.Scanner;

/**
 * Created by Marina on 1.6.2017 г..
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        double firstNum = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter the second number:");
        double secondNum = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter a number to check:");
        double numberToCheck = Double.parseDouble(scanner.nextLine());

        double minNum = 0;
        double maxNum = 0;
        if (firstNum > secondNum) {
            minNum = secondNum;
            maxNum = firstNum;
        } else if (secondNum > firstNum) {
            minNum = firstNum;
            maxNum = secondNum;
        } else {
            System.out.println("The two numbers should be different! ");
        }

        if (numberToCheck >= minNum && numberToCheck <= maxNum) {
            System.out.printf("The number %.2f is between %.2f and %.2f", numberToCheck, minNum, maxNum);
        } else {
            System.out.printf("The number %.2f is not between %.2f and %.2f", numberToCheck, minNum, maxNum);
        }

    }
}
