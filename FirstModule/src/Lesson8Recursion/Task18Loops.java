package Lesson8Recursion;

/**
 * Created by Marina on 29.6.2017 г..
 */
public class Task18Loops {
    public static void main(String[] args) {
        int first=1;
        int second=5;
        int index=1;


        printMultiplicationTable(first, second, index);
    }

     static void printMultiplicationTable(int first, int second, int index) {
        if(index>first || index>second){
            return;
        }
         for (int i = 1; i <= second; i++) {
             System.out.println(first+"*"+i);
         }
         System.out.println("***************");
         printMultiplicationTable(first+1,second,index+1);
    }
}
