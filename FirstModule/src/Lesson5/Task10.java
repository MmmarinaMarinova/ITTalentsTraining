package Lesson5;

import java.util.Scanner;

/**
 * Created by Marina on 10.6.2017 г..
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 7;
        int[] array = new int[size];
        int sum = 0;
        int average = 0;
        int minDiff = Integer.MAX_VALUE;
        int currentPosition = 0;

        System.out.println("Please enter the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        average = sum / size;

        for (int i = 0; i < size; i++) {
            int diff = array[i] - average;
            diff = ((diff < 0) ? -diff : diff);
            if (diff < minDiff) {
                minDiff = diff;
                currentPosition = i;
            }
        }
        System.out.println("The average is: " + average);
        System.out.println("The number closest to the average is: " + array[currentPosition]);


    }
}
