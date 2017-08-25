package Lesson8Recursion;

import java.util.Scanner;

/**
 * Created by Marina on 25.6.2017 г..
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=scanner.nextInt();
        int result=fibonacciCalculate(n);
        System.out.printf("The %d-th Fibonacci number is: %d", n, result);
    }

     static int fibonacciCalculate(int n) {
            if(n==1 || n==2){
                return 1;
            }else{
                return fibonacciCalculate(n-1)+fibonacciCalculate(n-2);
            }
    }
}
