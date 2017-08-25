package Lesson8Recursion;

import java.util.Scanner;

/**
 * Created by Marina on 25.6.2017 г..
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int first=scanner.nextInt();
        int second=scanner.nextInt();
        int current=first;
        printNumberTriangle(first, second, current);
    }

     static void printNumberTriangle(int first, int second, int current) {
        if(current<=second+1){
            for (int i = first ; i < current; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
            printNumberTriangle(first, second, current+1);
        }
    }
}
