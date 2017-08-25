package Lesson2;

import java.util.Scanner;

/**
 * Created by Marina on 1.6.2017 г..
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert as follows: day, month, year");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        boolean isBissextile = false;
        int maxDaysLength = 0;

        if ((day > 0 && day <= 31) && (month > 0 && month <= 12)) {
            //first check the year
            if ((year % 4 == 0) && (year % 400 == 0)) {
                isBissextile = true;
            }

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isBissextile = true;
                    } else {
                        isBissextile = false; //it's probably redundant
                    }
                }
                isBissextile = true;
            }

//checking the max length of the month
            if (month == 2) {
                if (isBissextile) {
                    maxDaysLength = 29;
                } else {
                    maxDaysLength = 28;
                }
            } else if (month == 1 || month == 3 || month == 5 || month == 7
                    || month == 8 || month == 10 || month == 12) {
                maxDaysLength = 31;
            } else {
                maxDaysLength = 30;
            }
//checking where to update the month and year
            if (day < maxDaysLength) {
                day++;
            } else if (day == maxDaysLength) {
                day = 1;
                month++;
                if (month >= 12) {
                    year++;
                    month = 1;
                }
            }
            System.out.printf("%d.%d.%d", day, month, year);
        } else {
            System.out.println("The date is not valid!");
        }
    }
}
