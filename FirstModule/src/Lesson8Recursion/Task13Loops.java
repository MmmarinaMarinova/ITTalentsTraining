package Lesson8Recursion;

/**
 * Created by Marina on 27.6.2017 г..
 */
public class Task13Loops {
    public static void main(String[] args) {
        int nachalo = 100;
        int krai = 999;
        int chislo = 23;

        printNum(nachalo,krai,chislo);
    }

     static void printNum(int nachalo, int krai, int chislo) {

        if (nachalo==krai){
            return;
        }
        int digit1 = nachalo/100;
        int digit2 = nachalo/10%10;
        int digit3 =nachalo%10;
        int sum = digit1+digit2+digit3;

        if (sum==chislo){
            System.out.println(nachalo);
        }
        printNum(nachalo+1,krai,chislo);

    }
}
