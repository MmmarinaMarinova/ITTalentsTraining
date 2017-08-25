package Lesson5;

import java.util.Scanner;

/**
 * Created by Marina on 10.6.2017 г..
 */
public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] nums1 = new int[size];
        int[] nums2 = new int[size];
        int[] nums3 = new int[size];

        System.out.println("Enter the first array: ");
        for (int i = 0; i < size; i++) {
            nums1[i] = scanner.nextInt();
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the second array: ");
        for (int i = 0; i < size; i++) {
            nums2[i] = scanner.nextInt();
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
        System.out.println("The third array is: ");
        for (int i = 0; i < size; i++) {
            nums3[i] = nums1[i] > nums2[i] ? nums1[i] : nums2[i];
            System.out.print(nums3[i] + " ");
        }
    }
}
