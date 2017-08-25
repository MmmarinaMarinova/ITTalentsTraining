package Lesson6;

/**
 * Created by Marina on 13.6.2017 г..
 */
public class Task04 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int size = numbers.length;
        int[][] resultNumbers = new int[size][size];
        int rowsCounter = numbers.length - 1;

        for (int rows = 0; rows < numbers.length; rows++) {
            for (int cols = 0; cols < numbers[rows].length; cols++) {
                resultNumbers[cols][rowsCounter] = numbers[rows][cols];
            }
            rowsCounter--;
        }

        for (int i = 0; i < resultNumbers.length; i++) {
            for (int j = 0; j < resultNumbers[i].length; j++) {
                System.out.print(resultNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
