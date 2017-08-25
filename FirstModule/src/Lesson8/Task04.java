package Lesson8;

import java.util.Scanner;

/**
 * Created by Marina on 20.6.2017 г..
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two people's names divided with ',' : ");
        String[] input = scanner.nextLine().split(", ");
        String firstName = input[0];
        String secondName = input[1];
        int firstSum = 0;
        int secondSum = 0;

        for (int i = 0; i < firstName.length(); i++) {
            firstSum += firstName.charAt(i);
        }
        for (int i = 0; i < secondName.length(); i++) {
            secondSum += secondName.charAt(i);
        }
        System.out.println(firstSum >= secondSum ? firstName : secondName);
    }
}
