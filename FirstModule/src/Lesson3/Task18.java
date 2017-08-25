package Lesson3;

import java.util.Scanner;

/**
 * Created by Marina on 8.6.2017 г..
 */
public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;

        do {
            System.out.println("Please enter one number between 1 and 9:");
            a = scanner.nextInt();
            System.out.println("Please enter second number between 1 and 9:");
            b = scanner.nextInt();
        } while (a < 1 || a > 9 || b < 1 || b > 9);

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }
}
