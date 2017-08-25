package Lesson5;

import java.util.Scanner;

/**
 * Created by Marina on 10.6.2017 г..
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int[] array = new int[10];
        array[0] = number;
        array[1] = number;

        for (int i = 0; i < 10; i++) {
            if (i > 1) {
                array[i] = array[i - 1] + array[i - 2];
            }
            System.out.print(array[i] + " ");
        }
    }
}
