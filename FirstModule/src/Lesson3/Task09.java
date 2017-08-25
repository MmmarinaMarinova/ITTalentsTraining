package Lesson3;

import java.util.Scanner;

/**
 * Created by Marina on 2.6.2017 г..
 */
public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        int min = 0;
        int max = 0;
        int sum = 0;

        if (a > b) {
            max = a;
            min = b;
        } else if (b > a) {
            max = b;
            min = a;
        } else {
            System.out.println("The numbers should be different!");
        }

        if (min * min % 3 == 0) {
            System.out.print("Skip 3");
        } else {
            System.out.print(min * min);
        }

        for (int i = min + 1; i <= max; i++) {
            if (sum > 200) {
                break;
            }

            int powered = i * i;
            if (powered % 3 == 0) {
                System.out.print(", Skip 3");
            } else {
                System.out.print(", " + powered);
                sum += powered;
            }
        }
    }
}
