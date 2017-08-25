package Lesson8Recursion;

/**
 * Created by Marina on 27.6.2017 г..
 */
public class Task03Loops {
    public static void main(String[] args) {
        int startNum=-9;
        int endNum=10;
        printOdds(startNum, endNum);

    }

     static void printOdds(int startNum, int endNum) {
        if(startNum>endNum){
            return;
        }
         System.out.print(startNum+" ");
        printOdds(startNum+2,endNum);
    }
}
