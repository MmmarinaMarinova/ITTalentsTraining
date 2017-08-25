package Lesson8Recursion;

/**
 * Created by Marina on 27.6.2017 г..
 */
public class Task12Loops {
    public static void main(String[] args) {
        int index=100;
        printNumbers(index);
    }

     static void printNumbers(int index) {
        if(index>999){
            return;
        }
        int firstDigit=index/100;
        int secondDigit=index/10%10;
        int thirdDigit=index%10;
        if(firstDigit!=secondDigit && secondDigit!=thirdDigit && firstDigit!=thirdDigit){
            System.out.print(index+" ");
        }
         printNumbers(index+1);

     }
}
