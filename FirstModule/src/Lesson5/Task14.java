package Lesson5;

import java.util.Scanner;

/**
 * Created by Marina on 10.6.2017 г..
 */
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size = scanner.nextInt();
        double[] nums = new double[size];

        System.out.println("Please enter the array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextDouble();
        }
//this can be done with one loop, but in the task it is given to work on the fully scanned array
        for (int i = 0; i < size; i++) {
            if (nums[i] >= -2.99 && nums[i] <= 2.99) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
