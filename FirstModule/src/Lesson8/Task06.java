package Lesson8;

import java.util.Scanner;

/**
 * Created by Marina on 20.6.2017 г..
 */
public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            StringBuilder strb = new StringBuilder(input[i]);
            String replaced = input[i].substring(0, 1).toUpperCase();
            strb.replace(0, 1, replaced);
            input[i] = strb.toString();
        }

        System.out.println(String.join(" ", input));
    }
}
