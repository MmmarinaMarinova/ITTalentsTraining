package Lesson8Strings;

import java.util.Scanner;

/**
 * Created by Marina on 22.6.2017 г..
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a name:");
        String[] name=scanner.nextLine().split(" ");
        System.out.println("Initials: "+name[0].charAt(0)+name[1].charAt(0));
    }
}
