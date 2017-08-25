package Lesson5;

import java.util.Scanner;

/**
 * Created by Marina on 10.6.2017 г..
 */
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 10;
        double[] nums = new double[size];
        double[] output = new double[size];

        System.out.println("Enter the array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextDouble();
            output[i] = nums[i];
            System.out.print(nums[i] + " ");
            //printiram gi taka zashtoto ne razbrah kakvo oznachava "sushtestvuvashtite chisla"
        }
        System.out.println();

        for (int i = 1; i <= size; i++) {
            if (nums[i - 1] < -0.231) {
                nums[i - 1] = i * i + 41.25;
            } else {
                nums[i - 1] = nums[i - 1] * i;
            }
            System.out.printf("%.2f ", nums[i - 1]);
        }


    }
}
