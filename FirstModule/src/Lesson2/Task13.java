package Lesson2;

import java.util.Scanner;

/**
 * Created by Marina on 1.6.2017 г..
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degrees = scanner.nextDouble();
        if (degrees >= -100 && degrees <= 100) {
            if (degrees < -20) {
                System.out.println("Freezing cold");
            } else if (degrees >= -20 && degrees < 0) {
                System.out.println("Cold");
            } else if (degrees >= 0 && degrees < 15) {
                System.out.println("Cool");
            } else if (degrees >= 15 && degrees < 25) {
                System.out.println("Warm");
            } else if (degrees >= 25) {
                System.out.println("Hot");
            }
        } else {
            System.out.println("The degree is not in the interval -100 - 100!");
        }

    }
}
