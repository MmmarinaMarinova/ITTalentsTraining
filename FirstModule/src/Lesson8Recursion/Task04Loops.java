package Lesson8Recursion;

/**
 * Created by Marina on 27.6.2017 г..
 */
public class Task04Loops {
    public static void main(String[] args) {
        printReverse(10);
    }

     static void printReverse(int i) {
        if(i<1){
            return;
        }
         System.out.print(i+" ");
        printReverse(i-1);
    }
}
