package Lesson5;

import java.util.Scanner;

/**
 * Created by Marina on 10.6.2017 г..
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int[] binaryNumber = new int[32];
        int remainder = 0;
        int counter = 0;

        while (number >= 1) {
            remainder = number % 2;
            number = number / 2;
            binaryNumber[counter] = remainder;
            counter++;
        }
//this is to remove zeros in front of the number, we can also do it with counting
// the zeros and then breaking the loop when encounter 1
        boolean isZero = false;
        boolean isOneHasBeenSeen = false; //this is a boolean to check if we already
        // have seen a 1 in our number(from left to right)
        for (int i = binaryNumber.length - 1; i >= 0; i--) {
            if (binaryNumber[i] == 0) {
                isZero = true;
            } else {
                isOneHasBeenSeen = true;
            }
            if (isZero && !isOneHasBeenSeen) {
                continue;
            } else {
                System.out.print(binaryNumber[i]);
            }

        }
    }
}
