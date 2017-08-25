package Lesson2;

import java.util.Scanner;

/**
 * Created by Marina on 1.6.2017 г..
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cisternSize = Integer.parseInt(scanner.nextLine());
        int rounds = 0;
        int additionalLiters = cisternSize % 5;
        if (cisternSize >= 10 && cisternSize <= 9999) {
            if (additionalLiters == 0) {
                rounds = cisternSize / 5;
                System.out.println(rounds + " times of 3 liter bucket");
                System.out.println(rounds + " times of 2 liter bucket");
            } else if (additionalLiters == 1) {
                rounds = (cisternSize / 5) - 1;
                System.out.println(rounds + " times of 3 liter bucket");
                System.out.println(rounds + " times of 2 liter bucket");
                System.out.println("2 additional round of 3 liter bucket");
            } else if (additionalLiters == 2) {
                rounds = cisternSize / 5;
                System.out.println(rounds + " times of 3 liter bucket");
                System.out.println(rounds + " times of 2 liter bucket");
                System.out.println("1 additional round of 2 liter bucket");
            } else if (additionalLiters == 4) {
                rounds = cisternSize / 5;
                System.out.println(rounds + " times of 3 liter bucket");
                System.out.println(rounds + " times of 2 liter bucket");
                System.out.println("2 additional rounds of 2 liter bucket");
            } else if (additionalLiters == 3) {
                rounds = cisternSize / 5;
                System.out.println(rounds + " times of 3 liter bucket");
                System.out.println(rounds + " times of 2 liter bucket");
                System.out.println("1 additional round of 3 liter bucket");
            }
        } else {
            System.out.println("The volume of the cistern is not in the interval 10-9999!");
        }
    }
}
