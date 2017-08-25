package Lesson8Recursion;

/**
 * Created by Marina on 27.6.2017 г..
 */
public class Task16Loops {
    public static void main(String[] args) {
        int nachalo =421;
        int krai =12;

        printNum(nachalo,krai);
    }

     static void printNum(int nachalo, int krai) {
        if (nachalo==krai){
            return;
        }
        if (nachalo%50==0){
            System.out.println(nachalo);
        }
        printNum(nachalo-1,krai);
    }
}
