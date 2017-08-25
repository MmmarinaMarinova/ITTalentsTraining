package Lesson5;

import java.util.Scanner;

/**
 * Created by Marina on 10.6.2017 г..
 */
public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] inputArray = new int[size];
        int[] outputArray = new int[size];

        System.out.println("Please enter the array: ");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }

        outputArray[0] = inputArray[0];
        outputArray[size - 1] = inputArray[size - 1];
        for (int i = 0; i < size; i++) {
            if (i != 0 && i != size - 1) {
                outputArray[i] = inputArray[i - 1] + inputArray[i + 1];
            }
            System.out.print(outputArray[i] + " ");
        }
    }
}
