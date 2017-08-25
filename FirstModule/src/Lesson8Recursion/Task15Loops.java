package Lesson8Recursion;

/**
 * Created by Marina on 27.6.2017 г..
 */
public class Task15Loops {
    public static void main(String[] args) {
        int n =8;

        System.out.println(printSum(n));
    }

     static int printSum(int n) {

        if (n==1){
            return 1;
        }
        return n + printSum(n-1);

    }
}
