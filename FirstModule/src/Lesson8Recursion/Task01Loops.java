package Lesson8Recursion;

/**
 * Created by Marina on 27.6.2017 г..
 */
public class Task01Loops {
    public static void main(String[] args) {
        int startNum=1;
        printNumbers(startNum);
    }

     static void printNumbers(int number) {
        if(number>100){
            return;
        }
         System.out.print(number+" ");
        printNumbers(number+1);
    }
}
