package Lesson8Strings;

import java.util.Scanner;

/**
 * Created by Marina on 22.6.2017 г..
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String secretWord="birichka";
        StringBuilder visibleWord=new StringBuilder("________");
        int attempts=10;

        do{
            System.out.println("Enter a character: ");
            char currentChar=scanner.nextLine().charAt(0);

            if(secretWord.contains(String.valueOf(currentChar))){
                int guessedCharIndex=secretWord.indexOf(currentChar); //take the index of the guessed character
                visibleWord.setCharAt(guessedCharIndex,currentChar); //show the word with the guessed symbols
                System.out.println("You guessed a character: ");
                System.out.println(visibleWord);
                System.out.printf("You have %d attempts left\n", attempts);
                secretWord=secretWord.replaceFirst(String.valueOf(currentChar),"*");
                //remove the guessed symbols from the secret word
                //in case you have more than one same symbols (in "birichka" there are two 'i'
                //on the second search, the symbol will be found on another position
            }else{
                attempts--;
                System.out.println("You didn't guess the character");
                System.out.println(visibleWord);
                System.out.printf("You have %d attempts left\n",attempts);
            }
            if(!visibleWord.toString().contains("_")){
                System.out.println("You have guessed the word! Congratulations");
                break;
            }
        }while(attempts>0);

        if(attempts==0){
            System.out.println("You didn't guess the word! You are hung!");
        }
    }
}
