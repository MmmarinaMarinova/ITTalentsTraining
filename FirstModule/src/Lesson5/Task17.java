package Lesson5;

import java.util.Scanner;

/**
 * Created by Marina on 10.6.2017 г..
 */
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size = scanner.nextInt();
        double[] nums = new double[size];
        boolean isZigZag = false;

        System.out.println("Enter the array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextDouble();
        }

        for (int i = 0; i < size - 2; i++) {
            if (nums[i] < nums[i + 1] && nums[i + 1] > nums[i + 2]) {
                isZigZag = true;
            }
        }
        System.out.println(isZigZag ? "The numbers are like zigzag" : "The numbers are not like zigzag");
    }
}
