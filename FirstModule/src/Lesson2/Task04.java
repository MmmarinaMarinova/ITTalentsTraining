package Lesson2;

import java.util.Scanner;

/**
 * Created by Marina on 1.6.2017 г..
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNum = scanner.nextInt();
        System.out.println("Enter the second number:");
        int secondNum = scanner.nextInt();

        if (firstNum == secondNum) {
            System.out.println("The numbers should be different!");
        } else {
            if (firstNum > secondNum) {
                System.out.println(secondNum + ", " + firstNum);
            } else {
                System.out.println(firstNum + ", " + secondNum);
            }
        }
    }

}
