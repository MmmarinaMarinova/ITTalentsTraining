package Tests;

import java.util.Scanner;

/**
 * Created by Marina on 3.7.2017 г..
 */
public class Test52Task01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int dice1=0;
        int dice2=0;
        int counter=0;
        int attempts=0;

        do{
            System.out.println("Enter the result from the first dice: ");
            dice1=scanner.nextInt();
            System.out.println("Enter the result from the second dice: ");
            dice2=scanner.nextInt();
            if(dice1+dice2==7){
                counter++;
            }
            attempts++;
        }while(counter<7);

        System.out.println("Attempts: "+attempts);
        System.out.println("Counter: "+counter);

    }
}
