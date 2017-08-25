package Lesson5;

import java.util.Scanner;

/**
 * Created by Marina on 10.6.2017 г..
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=7;
        int[] array=new int[size];

        System.out.println("Enter the array: ");
        for (int i = 0; i < size; i++) {
            array[i]=scanner.nextInt();
        }
//swap the first and the second with temp variable:
        int temp=array[0];
        array[0]=array[1];
        array[1]=temp;

//swap the third and the fourth with sum:
        array[2]=array[2]+array[3];
        array[3]=array[2]-array[3];
        array[2]=array[2]-array[3];

//swap the fifth and the sixth with multiplication:
        array[4]=array[4]*array[5];
        array[5]=array[4]/array[5];
        array[4]=array[4]/array[5];

        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }


    }
}
