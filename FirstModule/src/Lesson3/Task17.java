package Lesson3;

import java.util.Scanner;

/**
 * Created by Marina on 8.6.2017 г..
 */
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        String symbol = "";
        int innerSpaces = 0;

        System.out.println("Please enter the length of the square:");
        length = scanner.nextInt();
        System.out.println("Please enter a symbol: ");
        symbol = scanner.next();
        innerSpaces = length - 1;

        if (length < 3 || length > 20) {
            System.out.println("The length is invalid");
        } else {
            for (int i = 0; i < length; i++) {
                if (i == 0 || i == length - 1) {
                    for (int j = 0; j < length; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                } else {
                    System.out.print("*");
                    for (int j = 0; j < innerSpaces; j++) {
                        System.out.print(symbol);
                    }
                    System.out.print("*");
                    System.out.println();
                }
            }
        }


    }
}
