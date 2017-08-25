package Lesson3;

import java.util.Scanner;

/**
 * Created by Marina on 8.6.2017 г..
 */
public class Task12 {
    public static void main(String[] args) {
        int hundreds = 0;
        int tens = 0;
        int units = 0;
        for (int i = 100; i <= 999; i++) {
            units = i % 10;
            tens = i / 10 % 10;
            hundreds = i / 100 % 10;
            if (hundreds != tens && tens != units && hundreds != units) {
                System.out.println(i);
            }
        }
    }
}
