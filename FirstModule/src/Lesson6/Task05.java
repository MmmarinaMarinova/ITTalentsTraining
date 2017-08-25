package Lesson6;

/**
 * Created by Marina on 13.6.2017 г..
 */
public class Task05 {
    public static void main(String[] args) {
        int[][] nums = {
                {5, 11, 32, 4},
                {14, 4, 18, 0},
                {32, 10, 8, 9},
                {8, 42, 0, 7}
        };

        int columnSum = 0;
        int maxColumnSum = 0;
        int rowSum = 0;
        int maxRowSum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                rowSum += nums[i][j];

                for (int k = 0; k < nums.length; k++) {
                    columnSum += nums[k][j];
                }
                if (columnSum > maxColumnSum) {
                    maxColumnSum = columnSum;
                }
                columnSum = 0;
            }
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
            }
            rowSum = 0;
        }
        System.out.println("The maximal sum by rows is: " + maxRowSum);
        System.out.println("The minimal sum by columns is: " + maxColumnSum);
        if (maxColumnSum > maxRowSum) {
            System.out.println("The maximal sum by columns > the maximal sum by rows");
        } else if (maxColumnSum < maxRowSum) {
            System.out.println("The maximal sum by columns < the maximal sum by rows");
        } else {
            System.out.println("The two sums by rows and cols are equal");
        }


    }
}
