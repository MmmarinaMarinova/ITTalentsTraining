package Lesson5;

import java.util.Scanner;

/**
 * Created by Marina on 10.6.2017 г..
 */
public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the first array: ");
        int size1 = scanner.nextInt();
        System.out.println("Please enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        boolean isTheSame = false;

        if (size1 != size2) {
            isTheSame = false;
            System.out.println("The arrays are not the same!");
            return;
        }

        System.out.println("Please enter the first array: ");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Please enter the second array: ");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        for (int i = 0; i < size1; i++) {
            if (array1[i] == array2[i]) {
                isTheSame = true;
            } else {
                isTheSame = false;
            }
        }
        if (isTheSame) {
            System.out.println("The arrays are the same!");
        } else {
            System.out.println("The arrays are not the same!");
        }
    }
}
