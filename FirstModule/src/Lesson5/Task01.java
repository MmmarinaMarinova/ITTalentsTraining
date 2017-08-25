package Lesson5;

import java.util.Scanner;

/**
 * Created by Marina on 10.6.2017 г..
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size of the array:");
        int arraySize = scanner.nextInt();
        int[] inputArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i < arraySize; i++) {
            if (inputArray[i] % 3 == 0 && inputArray[i] < minNumber) {
                minNumber = inputArray[i];
            }
        }

        System.out.println(minNumber);
    }
}
