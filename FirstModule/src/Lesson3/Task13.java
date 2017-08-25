package Lesson3;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

/**
 * Created by Marina on 8.6.2017 г..
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 2 and 27 for the sum:");
        int sum = scanner.nextInt();
        int units = 0;
        int tens = 0;
        int hundreds = 0;

        //other way to swap variables
//        a=a+b;
//        b=a-b;
//        a=a-b;

        for (int i = 100; i <= 999; i++) {
            units = i % 10;
            tens = i / 10 % 10;
            hundreds = i / 100 % 10;
            if (units + tens + hundreds == sum) {
                System.out.println(i);
            }
        }
    }
}
