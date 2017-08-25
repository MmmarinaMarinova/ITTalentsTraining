package Lesson8;

import java.util.Scanner;

/**
 * Created by Marina on 20.6.2017 г..
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String input = scanner.next();
        for (int i = 0; i < input.length(); i++) {
            char oldChar = input.charAt(i);
            char newChar = (char) (input.charAt(i) + 5);
            if (i == 0) {
                input = input.replace(oldChar, newChar);
            } else {
                if (input.charAt(i) != input.charAt(i - 1)) {
                    input = input.replace(oldChar, newChar);
                }
            }

        }
        System.out.println(input);
    }
}
