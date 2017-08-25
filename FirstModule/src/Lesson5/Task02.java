package Lesson5;

import java.util.Scanner;

/**
 * Created by Marina on 10.6.2017 г..
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the initial array: ");
        int arraySize = scanner.nextInt();
        int outputArraySize = arraySize * 2;
        int[] inputArray = new int[arraySize];
        int[] outputArray = new int[outputArraySize];

        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int mirrorNumber = arraySize - 1;
        for (int i = 0; i < outputArraySize; i++) {
            if (i < arraySize) {
                outputArray[i] = inputArray[i];
            } else if (i >= arraySize) {
                outputArray[i] = inputArray[mirrorNumber];
                mirrorNumber--;
            }
            System.out.print(outputArray[i] + " ");
        }


    }
}
