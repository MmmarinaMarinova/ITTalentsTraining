package Lesson6;

import java.util.Scanner;

/**
 * Created by Marina on 13.6.2017 г..
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix: ");
        int size = scanner.nextInt();
        int[][] input = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        System.out.println("First diagonal: ");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i][i] + " ");
        }
        System.out.println();


        int cols = input[0].length - 1;
        for (int rows = 0; rows < input.length; rows++) {
            System.out.print(input[rows][cols] + " ");
            cols--;
        }

    }
}
