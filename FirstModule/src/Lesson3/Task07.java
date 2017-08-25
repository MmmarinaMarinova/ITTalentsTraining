package Lesson3;

import java.util.Scanner;

/**
 * Created by Marina on 2.6.2017 г..
 */
public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        int first = 3;
        System.out.print(first);

        for (int i = 1; i < n; i++) {
            first += 3;
            System.out.print(", " + first);
        }
    }
}
