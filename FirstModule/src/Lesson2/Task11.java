package Lesson2;

import java.util.Scanner;

/**
 * Created by Marina on 1.6.2017 г..
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digit1 = number / 100;
        int digit2 = number / 10 % 10;
        int digit3 = number % 10;

        if (digit1 == 0 || digit2 == 0 || digit3 == 0) {
            System.out.println("The number should not have a zero in it!");
        } else {
            if ((number % digit1 == 0) && (number % digit2 == 0) && (number % digit3 == 0)) {
                System.out.println("The number is divisible by all of its digits");
            } else {
                System.out.println("The number is not divisible by all of its digits");
            }

        }

    }
}
