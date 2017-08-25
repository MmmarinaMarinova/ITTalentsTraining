package Lesson2;

import java.util.Scanner;

/**
 * Created by Marina on 1.6.2017 г..
 */
public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the second number:");
        int a2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the third number:");
        int a3 = Integer.parseInt(scanner.nextLine());

        int currNum = a1;
        a1 = a2;
        a2 = a3;
        a3 = currNum;

        System.out.println(a1 + ", " + a2 + ", " + a3);

    }
}
