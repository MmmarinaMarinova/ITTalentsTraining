package Lesson3;

import java.util.Scanner;

/**
 * Created by Marina on 2.6.2017 г..
 */
public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        int max = 0;
        int min = 0;

//check if the number is negative, so that the result will be a negative number
        if (number > 1) {
            max = number;
            min = 1;
        } else {
            max = 1;
            min = number;
        }

        for (int i = min; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
