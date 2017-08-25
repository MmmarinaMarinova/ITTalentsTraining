package Tests;

import java.util.Scanner;

/**
 * Created by Marina on 4.7.2017 г..
 */
public class Test6Task01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int attempts=0;
        boolean result=false;
        do{
            System.out.println("Enter two card strengths: ");
            String input=scanner.nextLine();
            result=checkStrengths(input);
            if(result){
                System.out.println("You have drawn two aces! Attempts: "+attempts);
            }else{
                attempts++;
            }
        }while(!result);
    }

     static boolean checkStrengths(String input) {
        String[] cards=input.toUpperCase().split(" ");
        int trueCounter=0;

         for (int i = 0; i < cards.length; i++) {
             switch (cards[i]){
                 case "2":
                 case "3":
                 case "4":
                 case "5":
                 case "6":
                 case "7":
                 case "8":
                 case "9":
                 case "T":
                 case "J":
                 case "Q":
                 case "K": break;
                 case "A":{
                     trueCounter++;
                     break;
                 }
                 default:
                 {
                     System.out.println("Invalid input");
                     break;
                 }
             }
         }
         if(trueCounter==2){
             return true;
         }else {
             return false;
         }
    }
}
