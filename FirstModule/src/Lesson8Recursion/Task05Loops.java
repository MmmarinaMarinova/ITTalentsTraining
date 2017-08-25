package Lesson8Recursion;


/**
 * Created by Marina on 27.6.2017 г..
 */
public class Task05Loops {
    public static void main(String[] args) {
        int first=35;
        int second=17;
        int max=Math.max(first,second);
        int min=Math.min(first,second);
        printNumbers(min, max);
    }

     static void printNumbers(int min, int max) {
        if(min>max){
            return;
        }
         System.out.print(min+" ");
        printNumbers(min+1,max);
    }
}
