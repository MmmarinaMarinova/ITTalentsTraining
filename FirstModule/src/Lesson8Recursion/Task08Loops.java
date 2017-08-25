package Lesson8Recursion;

/**
 * Created by Marina on 27.6.2017 г..
 */
public class Task08Loops {
    public static void main(String[] args) {
        int n=4;
        int index=1;
        int num=n-1;
        printMatrix(n,index,num);
    }

     static void printMatrix(int n,int index,int number) {
        if(index>n){
            return;
        }
         for (int i = 0; i < n; i++) {
             System.out.print(number+" ");
         }
         System.out.println();
        printMatrix(n,index+1,number+2);
    }
}
