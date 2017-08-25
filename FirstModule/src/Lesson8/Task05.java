package Lesson8;

import java.util.Scanner;

/**
 * Created by Marina on 20.6.2017 г..
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two words: ");
        String firstString = scanner.next();
        String secondString = scanner.next();
        int pos = 0;
//I have solved the task, but the crossing positions are different from the example
        for (int i = 0; i < secondString.length(); i++) {
            for (int j = 0; j < firstString.length(); j++) {
                if (secondString.charAt(i) == firstString.charAt(j)) {
                    pos = j;
                    break;
                }
            }
        }

        for (int i = 0; i < firstString.length(); i++) {
            if (i != pos) {
                for (int j = 0; j < pos; j++) {
                    System.out.print(" ");
                }
                System.out.print(firstString.charAt(i));
                System.out.println();
            } else {
                System.out.print(secondString);
                System.out.println();
            }
        }

    }
}
