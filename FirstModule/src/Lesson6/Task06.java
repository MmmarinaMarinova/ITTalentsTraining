package Lesson6;

/**
 * Created by Marina on 13.6.2017 г..
 */
public class Task06 {
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
        int rowSum = 0;

        for (int i = 1; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i].length; j++) {
                currentRowSum += nums[i][j];
                System.out.print(nums[i][j] + " ");
            }
            System.out.print("Row sum: " + currentRowSum);
            System.out.println();
            rowSum += currentRowSum;
            currentRowSum = 0;
        }

        System.out.println("All rows sum: " + rowSum);
    }
}
