package Lesson8Recursion;

import java.util.Scanner;

/**
 * Created by Marina on 25.6.2017 г..
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=scanner.nextInt();
        int index=0;
        makeReverse(number,index);

    }

    static void makeReverse(int number,int index) {
        char[] numberChars=String.valueOf(number).toCharArray();
        char temp=numberChars[index];
        numberChars[index]=numberChars[numberChars.length-1];
        numberChars[numberChars.length-1]=temp;

        if(index==numberChars.length-1){
            String result=numberChars.toString();
            System.out.println(result);
            if(String.valueOf(number).equals(result)){
                System.out.println("The number is a palindrome");
            }else{
                System.out.println("The number is not a palindrome");
            }
        }else{
            makeReverse(number, index+1);
        }
    }
}
