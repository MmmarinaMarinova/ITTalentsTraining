package Lesson8;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Marina on 20.6.2017 г..
 */
public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        StringBuilder input = new StringBuilder(scanner.next());
        StringBuilder reversedString = input.reverse();
        if (input.toString().equals(reversedString.toString())) {
            System.out.println("The word is a palindrome!");
        } else {
            System.out.println("The word is not a palindrome");
        }


    }
}
