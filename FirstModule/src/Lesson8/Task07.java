package Lesson8;

import java.util.Scanner;

/**
 * Created by Marina on 20.6.2017 г..
 */
public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some words: ");
        String[] input = scanner.nextLine().split(" ");
        int maxLength = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i].length() > maxLength) {
                maxLength = input[i].length();
            }
        }
        System.out.printf("%d words, the longest is %d characters", input.length, maxLength);
    }


}
