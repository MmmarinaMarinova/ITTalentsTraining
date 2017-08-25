package Lesson14;

import java.util.Random;

/**
 * Created by Marina on 12.7.2017 г..
 */
public class Deck {
    private Card[] cards;

    public Deck() {
        cards=new Card[52];
        fillCardsInDeck();
    }

    /**
     * fills all the cards in the created deck by order of strength
     * N.B. the cards will not be mixed in the deck!!!
     * Method shuffleDeck() should be called to mix the deck
     */
    void fillCardsInDeck(){
        int currentPosition=0;
        for (int strength = 2; strength <= 14; strength++) {
            for (int suit = 1; suit <= 4; suit++) {
                Card currentCard=new Card();
                currentCard.setStrengthValue(strength);
                switch (strength){
                    case 2: currentCard.setStrength('2');break;
                    case 3: currentCard.setStrength('3');break;
                    case 4: currentCard.setStrength('4');break;
                    case 5: currentCard.setStrength('5');break;
                    case 6: currentCard.setStrength('6');break;
                    case 7: currentCard.setStrength('7');break;
                    case 8: currentCard.setStrength('8');break;
                    case 9: currentCard.setStrength('9');break;
                    case 10: currentCard.setStrength('T');break;
                    case 11: currentCard.setStrength('J');break;
                    case 12: currentCard.setStrength('Q');break;
                    case 13: currentCard.setStrength('K');break;
                    case 14: currentCard.setStrength('A');break;
                }
                cards[currentPosition]=currentCard;
                currentPosition++;
            }
        }
    }

    /**
     * A method that shuffles the cards in the deck
     * so that the dealing of cards after that is fair.
     * It is based on Fisher-Yates algorithm using simple
     * swapping of variables
     */
    void shuffleDeck(){
        Random random=new Random();
        for (int i = cards.length-1; i>0 ; i--) {
            int position=random.nextInt(i+1);
            Card temp=cards[position];
            cards[position]=cards[i];
            cards[i]=temp;
        }
    }

    /**
     * Deal 26 cards for one of the players and 26 for the other
     * @param player1
     * @param player2
     */
    void deal(Player player1, Player player2){
        Card[] firstDeck=new Card[26];
        Card[] secondDeck=new Card[26];
        for (int i = 0; i < cards.length; i++) {
            if(i<26){
                firstDeck[i]=cards[i];
            }else{
                secondDeck[i-26]=cards[i];
            }
        }
        player1.setStartDeck(firstDeck);
        player2.setStartDeck(secondDeck);

        /*System.out.println("First player cards: ");
        for (int i = 0; i < 26; i++) {
            System.out.println(player1.getStartDeck()[i].getStrength());
        }

        System.out.println("Second player cards: ");
        for (int i = 0; i <26 ; i++) {
            System.out.println(player2.getStartDeck()[i].getStrength());
        }*/
    }
}
