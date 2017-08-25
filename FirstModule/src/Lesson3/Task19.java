package Lesson3;

import java.util.Scanner;

/**
 * Created by Marina on 8.6.2017 г..
 */
public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = 0;
        double nextNumber = 0;

        do {
            System.out.println("Please enter a number between 10 and 99:");
            number = scanner.nextInt();
        } while (number < 10 || number > 99);

        System.out.print((int) number);
        while (nextNumber != 1) {
            if (number % 2 == 0) {
                nextNumber = 0.5 * number;
            } else {
                nextNumber = 3 * number + 1;
            }
            System.out.print(" " + (int) nextNumber);
            number = nextNumber;
        }

    }
}
