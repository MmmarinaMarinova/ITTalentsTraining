package Lesson3;

import java.util.Scanner;

/**
 * Created by Marina on 2.6.2017 г..
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = scanner.nextInt();

        if (firstNum > secondNum) {
            for (int i = secondNum; i <= firstNum; i++) {
                System.out.println(i);
            }
        } else if (firstNum < secondNum) {
            for (int i = firstNum; i <= secondNum; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("The numbers cannot be the same!");
        }
    }
}
