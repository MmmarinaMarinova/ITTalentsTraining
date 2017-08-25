package Lesson5;

import java.util.Scanner;

/**
 * Created by Marina on 10.6.2017 г..
 */
public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        double[] nums = new double[size];
        double maxSum = 0;
        int firstPos = 0;
        int secondPos = 0;
        int thirdPos = 0;

        System.out.println("Enter the array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextDouble();
            nums[i] = ((nums[i] < 0) ? -nums[i] : nums[i]);
        }

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                for (int k = j; k < size; k++) {
                    double currentSum = nums[i] + nums[j] + nums[k];
                    if ((currentSum > maxSum) && (nums[i] != nums[j]) && (nums[j] != nums[k])) {
                        maxSum = nums[i] + nums[j] + nums[k];
                        firstPos = i;
                        secondPos = j;
                        thirdPos = k;
                    }
                }
            }
        }

        System.out.println(maxSum);
        System.out.print(nums[firstPos] + " + " + nums[secondPos] + " + " + nums[thirdPos]);


    }
}
