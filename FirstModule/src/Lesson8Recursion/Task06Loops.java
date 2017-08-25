package Lesson8Recursion;

/**
 * Created by Marina on 27.6.2017 г..
 */
public class Task06Loops {
    public static void main(String[] args) {
        int secondNumber=7;
        int sum=0;
        int index=1;
        int result=calculateSum(secondNumber,sum,index);
        System.out.println("The sum is: "+result);
    }

     static int calculateSum(int secondNumber,int sum, int i) {
        if(i>secondNumber){
            return sum;
        }
        sum+=i;
        return calculateSum(secondNumber,sum, i+1);
    }
}
