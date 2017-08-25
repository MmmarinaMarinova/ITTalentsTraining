package Lesson6;

import java.util.Scanner;

/**
 * Created by Marina on 13.6.2017 г..
 */
public class AdditionalTask01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the matrix: ");
        int size = scanner.nextInt();
        int[][] square = new int[size][size];
        boolean isMagical = false;
        int sum = 0;
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;

//enter the matrix and calculate the initial sum of the first row:
        System.out.println("Fill the matrix with numbers between 1 and 20: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                square[i][j] = scanner.nextInt();
                if (i == 0) {
                    sum += square[i][j];
                }
            }
        }

//counting by rows, cols, diagonals
        for (int i = 0; i < square.length; i++) {
            int currentRowSum = 0;
            int currentColSum = 0;
            for (int j = 0; j < square[i].length; j++) {
                currentRowSum += square[i][j];
                currentColSum += square[j][i];
                if (i == j) {
                    firstDiagonalSum += square[i][j];
                }
                if (i + j == square.length - 1) {
                    secondDiagonalSum += square[i][j];
                }
            }
            if (currentRowSum != sum || currentColSum != sum) {
                isMagical = false;
                System.out.println("The square is not magical!");
                break;
            } else {
                isMagical = true;
            }
        }
        if (firstDiagonalSum != sum || secondDiagonalSum != sum) {
            isMagical = false;
        }
        System.out.println(isMagical ? "The square is magical, the sum is " + sum : "The square is not magical");
    }
}
