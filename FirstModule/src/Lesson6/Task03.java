package Lesson6;

/**
 * Created by Marina on 13.6.2017 г..
 */
public class Task03 {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 5, 8, 11, 17, 13},
                {1, 11, 32},
                {3, 42, 17, 15},
                {6, 18, 11}
        };
        double average = 0;
        double count = 0;
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                count++;
            }
        }
        average = sum / count;
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is: " + average);
    }
}
