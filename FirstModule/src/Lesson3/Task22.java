package Lesson3;

import java.util.Scanner;

/**
 * Created by Marina on 8.6.2017 г..
 */
public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int counter = 1;

        do {
            System.out.println("Please enter a number: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 999);

        int currNumber = number + 1;

        while (counter <= 10) {
            if (currNumber % 2 == 0 || currNumber % 3 == 0 || currNumber % 5 == 0) {
                System.out.println(counter + " : " + currNumber);
                counter++;
            }
            currNumber++;
        }

    }
}
