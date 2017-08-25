package Lesson6;

/**
 * Created by Marina on 13.6.2017 г..
 */
public class Task07 {
    public static void main(String[] args) {
        int[][] nums = {
                {11, 12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, 36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66}
        };
        int currentRowSum = 0;
        int rowsSum = 0;
        int colsCounter = 0;
        int rowsCounter = 0;
        int numberOfOps = nums.length * nums.length;
        int endLine = nums.length - 1;

        for (int i = 0; i < numberOfOps; i++) {
            rowsCounter = i / nums.length;
            colsCounter = i % nums.length;
            if ((rowsCounter + colsCounter) % 2 == 0) {
                currentRowSum += nums[rowsCounter][colsCounter];
                System.out.print(nums[rowsCounter][colsCounter] + " ");
            }
            if (i == endLine) {
                rowsSum += currentRowSum;
                System.out.print("---> The current row sum is: " + currentRowSum);
                System.out.println();
                currentRowSum = 0;
                endLine += nums.length;
            }
        }
        System.out.println("All rows sum is: " + rowsSum);


    }
}
