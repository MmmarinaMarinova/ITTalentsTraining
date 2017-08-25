package Lesson8Recursion;

import java.util.Scanner;

/**
 * Created by Marina on 25.6.2017 г..
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int result=multiply(a,b);
        System.out.printf("The multiplication of %d and %d is: %d",a, b, result);
    }

     static int multiply(int a, int b) {
        if(a==1){
            return b;
        }
        return b+multiply(a-1,b);
    }
}
