package Lesson6;

/**
 * Created by Marina on 13.6.2017 г..
 */
public class AdditionalTask04 {
    public static void main(String[] args) {
        int n = 6;
        int k = 6;
        int[][] nums = {
                {6, 12, 45, 11},
                {23, 15, 27, 16},
                {7, 23, 9, 19},
                {18, 4, 7, 21},
                {12, 14, 27, 21},
                {8, 5, 26, 9}
        };
        int[][] resultNums = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if (j < nums[i].length) {
                    resultNums[i][j] = nums[i][j];
                }
                System.out.print(resultNums[i][j] + " ");
            }
            System.out.println();
        }

    }
}
