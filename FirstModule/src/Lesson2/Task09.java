package Lesson2;

import java.util.Scanner;

/**
 * Created by Marina on 1.6.2017 г..
 */
public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {
            int multiplied = a * b;
            int lastDigit = multiplied % 10;
            if (lastDigit % 2 == 0) {
                System.out.println(multiplied + ", " + lastDigit + " even");
            } else {
                System.out.println(multiplied + ", " + lastDigit + " odd");
            }
        } else {
            System.out.println("The numbers are not in the interval 10-99!");
        }

    }
}
