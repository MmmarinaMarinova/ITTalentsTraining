package Lesson3;

import java.util.Scanner;

/**
 * Created by Marina on 8.6.2017 г..
 */
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        do {
            System.out.println("Please enter a number between 10 and 200: ");
            number = scanner.nextInt();
        } while (number < 10 && number > 200);

        for (int i = number; i > 0; i--) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
