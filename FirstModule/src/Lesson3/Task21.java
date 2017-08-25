package Lesson3;

import java.util.Scanner;

/**
 * Created by Marina on 8.6.2017 г..
 */
public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cardIndex = 0;
        String card = "";
        String color = "";
        int currentCard = 1;

        do {
            System.out.println("Please enter a number between 1 and 51: ");
            cardIndex = scanner.nextInt();
        } while (cardIndex < 1 || cardIndex > 51);

        for (int i = 2; i <= 14; i++) {
            for (int j = 1; j <= 4; j++) {
                switch (i) {
                    case 2:
                        card = "2";
                        break;
                    case 3:
                        card = "3";
                        break;
                    case 4:
                        card = "4";
                        break;
                    case 5:
                        card = "5";
                        break;
                    case 6:
                        card = "6";
                        break;
                    case 7:
                        card = "7";
                        break;
                    case 8:
                        card = "8";
                        break;
                    case 9:
                        card = "9";
                        break;
                    case 10:
                        card = "10";
                        break;
                    case 11:
                        card = "Vale";
                        break;
                    case 12:
                        card = "Dama";
                        break;
                    case 13:
                        card = "Pop";
                        break;
                    case 14:
                        card = "Aso";
                        break;
                    default:
                        System.out.println("No such card");
                }


                switch (j) {
                    //spatiq karo pika kupa
                    case 1:
                        color = "Spatiq";
                        break;
                    case 2:
                        color = "Karo";
                        break;
                    case 3:
                        color = "Kupa";
                        break;
                    case 4:
                        color = "Pika";
                        break;
                    default:
                        System.out.println("No such card");
                }
                if (currentCard >= cardIndex) {
                    System.out.println(card + " " + color);
                }

                currentCard++;
            }
        }


    }
}
