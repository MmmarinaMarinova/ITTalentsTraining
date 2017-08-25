package Lesson8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Marina on 20.6.2017 г..
 */
public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.next();
        int sum = 0;

        input = input.replaceAll("[^-?0-9]+", " "); //remove others chars
        String[] resultNums = input.trim().split(" "); //remove empty,split in array
        for (int i = 0; i < resultNums.length; i++) {
            if (resultNums[i].contains("-")) {
                int pos = resultNums[i].indexOf("-");
                if (pos > 0) { //if there is a - in the string, divide in two numbers
                    String substring1 = resultNums[i].substring(0, pos); //first number from the start to the minus
                    String substring2 = resultNums[i].substring(pos); // second number from the minus to the end
                    int firstNumber = Integer.parseInt(substring1);
                    int secondNumber = Integer.parseInt(substring2);
                    System.out.println(firstNumber);
                    System.out.println(secondNumber);
                    sum += firstNumber;
                    sum += secondNumber;
                } else { //if the '-' is in the first position, just make the number negative
                    int number = Integer.parseInt(resultNums[i]);
                    sum += number;
                    System.out.println(number);
                }
            } else {
                System.out.println(resultNums[i]);
                int number = Integer.parseInt(resultNums[i]);
                sum += number;
            }
        }
        System.out.println("Sum: " + sum);

    }
}
