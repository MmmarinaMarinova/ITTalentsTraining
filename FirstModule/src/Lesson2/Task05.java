package Lesson2;

import java.util.Scanner;

/**
 * Created by Marina on 1.6.2017 г..
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the second number:");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the third number:");
        int c = Integer.parseInt(scanner.nextLine());


        if (a > b) {
            if (b > c) {
                System.out.println(a + ", " + b + ", " + c);
            } else if (b < c) {
                System.out.println(a + ", " + c + ", " + b);
            }
        } else if (b > a) {
            if (a > c) {
                System.out.println(b + ", " + a + ", " + c);
            } else {
                System.out.println(b + ", " + c + ", " + a);
            }
        } else if (c > a) {
            if (a > b) {
                System.out.println(c + ", " + a + ", " + b);
            } else {
                System.out.println(c + ", " + b + ", " + a);

            }
        }

    }
}

 /* int minNumber=0;
        int medNumber=0;
        int maxNumber=0;

        if(first>second){
            if(first>third){
                maxNumber=first;
                if(second>third){
                    medNumber=second;
                    minNumber=third;
                }else{
                    medNumber=third;
                    minNumber=second;
                }
            }else{
                medNumber=first;
                maxNumber=third;
                minNumber=second;
            }
        }else {
            if (second > third) {
                maxNumber = second;
                if (first > third) {
                    medNumber = first;
                    minNumber = third;
                } else {
                    medNumber = third;
                    minNumber = first;
                }
            } else {
                medNumber = second;
                maxNumber = third;
                minNumber = first;
            }
        }
*/