package Lesson6;

/**
 * Created by Marina on 13.6.2017 г..
 */
public class Task01 {
    public static void main(String[] args) {
        int[][] input = {
                {48, 72, 13, 14, 15},
                {21, 22, 53, 24, 75},
                {31, 57, 33, 34, 35},
                {41, 95, 43, 44, 45},
                {59, 52, 53, 54, 55},
                {61, 69, 63, 64, 65}
        };

        int minNumber = input[0][0];
        int maxNumber = input[0][0];

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] < minNumber) {
                    minNumber = input[i][j];
                }
                if (input[i][j] > maxNumber) {
                    maxNumber = input[i][j];
                }
            }
        }

        System.out.println("The minimal number in the array is: " + minNumber);
        System.out.println("The maximal number in the array is: " + maxNumber);
    }
}
