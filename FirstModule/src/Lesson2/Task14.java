package Lesson2;

import java.util.Scanner;

/**
 * Created by Marina on 1.6.2017 г..
 */
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter coordinates as follows: x1 y1 x2 y2");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        //first validate numbers
        if ((x1 > 0 && x1 <= 8) && (y1 > 0 && y1 <= 8) &&
                (x2 > 0 && x1 <= 8) && (y2 > 0 && y2 <= 8)) {
//then check the points
            if ((x1 + y1) % 2 == (x2 + y2) % 2) {
                System.out.println("The two points are in the same color");
            } else {
                System.out.println("The two points are in different colors");
            }
        } else {
            System.out.println("The coordinates are not valid!");
        }


    }
}
