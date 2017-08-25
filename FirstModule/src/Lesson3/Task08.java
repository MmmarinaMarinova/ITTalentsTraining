package Lesson3;

import java.util.Scanner;

/**
 * Created by Marina on 2.6.2017 г..
 */
public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The number should be bigger than 0!");
        } else {
            int initialNumber = n - 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(initialNumber);
                }
                System.out.println();
                initialNumber += 2;
            }
        }
    }
}
