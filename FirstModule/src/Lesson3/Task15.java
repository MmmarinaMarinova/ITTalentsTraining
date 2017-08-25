package Lesson3;

import java.util.Scanner;

/**
 * Created by Marina on 8.6.2017 г..
 */
public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        int i = 0;
        int sum = 0;

        do {
            sum += i;
            i++;
        } while (i <= number);

        System.out.println("The sum is: " + sum);
    }
}
