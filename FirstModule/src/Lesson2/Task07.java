package Lesson2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by Marina on 1.6.2017 г..
 */
public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how much money you have:");
        double money = scanner.nextDouble();
        System.out.println("Enter are you sick:");
        boolean isSick = scanner.nextBoolean();

        if (money >= 0) {
            if (isSick) {
                System.out.println("I won't go out");
            } else {
                System.out.println("I will go to the cinema with friends");
            }
//not sure if I had to check if the person is sick here:
            if (money >= 0 && isSick) {
                System.out.println("I will buy medicine");
            } else if (money <= 0 && isSick) {
                System.out.println("I will drink tea at home");
            }

            if (money < 10 && !isSick) {
                System.out.println("I will go to the cafe");
            }
        } else {
            System.out.println("The money cannot be a negative number!");
        }


    }

}
