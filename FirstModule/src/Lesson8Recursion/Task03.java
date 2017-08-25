package Lesson8Recursion;

import java.util.Scanner;

/**
 * Created by Marina on 25.6.2017 г..
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scanner.nextInt();
        int index=2;
        int result=isPrime(num,index);
        if(result==1){
            System.out.println("The number is prime");
        }else{
            System.out.println("The number is not prime");
        }
    }

     static int isPrime(int num,int index) {
        if(num<=3){
            return 1;
        }
        if(index<num){
            if(num%index==0 ){
                return 0;
            }
            return isPrime(num,index+1);
        }
        return 1;
    }
}
