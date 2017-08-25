package Lesson2;

import java.util.Scanner;

/**
 * Created by Marina on 1.6.2017 г..
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        double firstNum = scanner.nextDouble();
        System.out.println("Please enter the second number:");
        double secondNum = scanner.nextDouble();

        if (firstNum == secondNum) {
            System.out.println("The numbers should be different!");
        } else {
            double sum = firstNum + secondNum;
            double difference = firstNum - secondNum;
            double multiplication = firstNum * secondNum;
            double division = firstNum / secondNum;
            double remainder = firstNum % secondNum;

            System.out.printf("Sum: %.2f\n", sum);
            System.out.printf("Difference: %.2f\n", difference);
            System.out.printf("Multiplication: %.2f\n", multiplication);
            System.out.printf("Division: %.2f\n", division);
            System.out.printf("Remainder: %.2f ", remainder);
        }
    }
}
