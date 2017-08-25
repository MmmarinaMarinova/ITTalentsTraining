package Lesson5;

import java.util.Scanner;

/**
 * Created by Marina on 10.6.2017 г..
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] inputArray = new int[size];
        boolean isMirror = false;

        System.out.println("Please enter the array:");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (inputArray[i] != inputArray[size - i - 1]) {
                isMirror = false;
                break;
            } else {
                isMirror = true;
            }
        }
        if (isMirror) {
            System.out.println("The array is mirrorlike");
        } else {
            System.out.println("The array is not mirrorlike");
        }
    }
}
