package Lesson8Recursion;

import java.util.Scanner;

/**
 * Created by Marina on 27.6.2017 г..
 */
public class Task14Loops {
    public static void main(String[] args) {
        int chislo =154;
        int krai =10;

        printNum(chislo, krai);
    }

     static void printNum(int chislo, int krai) {
        if (chislo==krai){
            return;
        }

        if (chislo>krai && chislo%7==0){
            System.out.println(chislo);
        }
        printNum(chislo-1,krai);
    }


}
