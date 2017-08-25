package Lesson5;

import java.util.Scanner;

/**
 * Created by Marina on 10.6.2017 г..
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 7;
        int[] array = new int[size];
        int counter = 0;

        System.out.println("Enter the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 5 == 0 && array[i] > 5) {
                System.out.print(array[i] + " ");
                counter++;
            }
        }
        System.out.println("Final count: " + counter);


    }


}
