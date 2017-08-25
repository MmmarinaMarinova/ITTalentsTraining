package Lesson8Recursion;

/**
 * Created by Marina on 27.6.2017 г..
 */
public class Task09Loops {
    public static void main(String[] args) {
        int a=1;
        int b=107;
        int sum=0;
        printPowers(a, b, sum);
    }

     static void printPowers(int a, int b, int sum) {
        if(a>b){
            return;
        }
        if(sum>200){
            System.out.println("The sum is bigger than 200");
            return;
        }
        if(a%3==0){
            System.out.print("Skip 3\n");
        }
        else{
            sum+=a;
            System.out.printf("The power of %d is: %d \n",a, a*a );
        }
        printPowers(a+1,b,sum);
    }
}
