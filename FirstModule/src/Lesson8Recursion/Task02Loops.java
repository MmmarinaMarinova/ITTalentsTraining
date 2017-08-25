package Lesson8Recursion;

/**
 * Created by Marina on 27.6.2017 г..
 */
public class Task02Loops {
    public static void main(String[] args) {
        int startNum=-20;
        int endNum=50;
        printNumbers(startNum, endNum);
    }

     static void printNumbers(int startNum, int endNum) {
        if(startNum>endNum){
            return;
        }
         System.out.print(startNum+" ");
        printNumbers(startNum+1,endNum);
    }
}
