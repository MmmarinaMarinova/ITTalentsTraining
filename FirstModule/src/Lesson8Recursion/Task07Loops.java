package Lesson8Recursion;

/**
 * Created by Marina on 27.6.2017 г..
 */
public class Task07Loops {
    public static void main(String[] args) {
        int count=5;
        int start=3;
        int index=1;
        printNums(start, count,index);

    }

     static void printNums(int start, int count,int index) {
        if(index>count){
            return;
        }
         System.out.print(start+" ");
        printNums(start+3,count,index+1);
    }
}
