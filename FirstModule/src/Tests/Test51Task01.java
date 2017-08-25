package Tests;

import java.util.Scanner;

/**
 * Created by Marina on 4.7.2017 г..
 */
public class Test51Task01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int headsCounter=0;
        String input="";

        do{
            System.out.println("Enter heads or tails: ");
            input=scanner.next().toLowerCase();
            if("heads".equals(input)){
                headsCounter++;
            }else{
                headsCounter=0;
            }
        }while(headsCounter<5);
        System.out.println("Counter of heads reached 5!");

    }
}
