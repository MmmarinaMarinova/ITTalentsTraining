package Lesson5;

import java.util.Scanner;

/**
 * Created by Marina on 10.6.2017 г..
 */
public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int currentSubsequentSize = 1;
        int previousSubsequentSize = 1;

        System.out.println("Please enter the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 1; i < size; i++) {
            if (array[i] == array[i - 1]) {
                currentSubsequentSize++;
            } else {
                previousSubsequentSize = currentSubsequentSize;
                currentSubsequentSize = 1;
            }
        }

        if (previousSubsequentSize > currentSubsequentSize) {
            System.out.println(previousSubsequentSize);
        } else {
            System.out.println(currentSubsequentSize);
        }


    }
}
