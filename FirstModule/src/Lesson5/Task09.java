package Lesson5;

import java.util.Scanner;

/**
 * Created by Marina on 10.6.2017 г..
 */
public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] inputArray = new int[size];
        int[] outputArray = new int[size];
        int temp = 0;

        System.out.println("Enter the array: ");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }

//with additional array: 
        for (int i = 0; i < size; i++) {
            outputArray[i] = inputArray[size - i - 1];
            System.out.print(outputArray[i] + " ");
        }
        System.out.println();

//without additional array:
        for (int i = 0; i < size / 2; i++) {
            temp = inputArray[i];
            inputArray[i] = inputArray[size - i - 1];
            inputArray[size - i - 1] = temp;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(inputArray[i] + " ");
        }
    }
}
