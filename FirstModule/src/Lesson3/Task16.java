package Lesson3;

import java.util.Scanner;

/**
 * Created by Marina on 8.6.2017 г..
 */
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int temp = 0;

        do {
            System.out.println("Please enter number a between 10 and 5555: ");
            a = scanner.nextInt();
            System.out.println("Please enter number b between 10 and 5555: ");
            b = scanner.nextInt();
        } while (a < 10 || a > 5555 || b < 10 || b > 5555);

        if (b > a) {
            temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i >= b; i--) {
            if (i % 50 == 0) {
                System.out.println(i);
            }
        }
    }
}
