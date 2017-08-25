package Lesson14;

import java.util.Arrays;

/**
 * Created by Marina on 12.7.2017 г..
 */
public class WarGame {
    public static void main(String[] args) {
        Player player1 = new Player("Ivancho");
        Player player2 = new Player("Mariika");

        Deck deck=new Deck();
        deck.shuffleDeck();
        deck.deal(player1,player2);

       Player winner = playWarGame(player1, player2);
        System.out.println("The winner is: "+winner.getName());
        System.out.println(player1.getName() +" has "+player1.getWonDeck());
        System.out.println(player2.getName() +" has "+player2.getWonDeck());

    }

    static Player playWarGame(Player player1, Player player2) {
        checkWinningCard(player1,player2,2);
        return player1.getWonDeck()>player2.getWonDeck() ? player1 : player2;
    }

    /**
     * The method checks the winning card and puts into
     * the winner's won deck the cards that have been
     * won(2, or in state of war-8)
     * @param player1
     * @param player2
     * @param wonCards
     */
    static void checkWinningCard(Player player1, Player player2, int wonCards){
        Card card1=player1.playACard();
        Card card2=player2.playACard();
        if(card1.getStrengthValue()>card2.getStrengthValue()){
            player1.setWonDeck(player1.getWonDeck()+wonCards);
        }else if( card2.getStrengthValue()<card2.getStrengthValue()){
            player2.setWonDeck(player2.getWonDeck()+wonCards);
        }else{
            stateOfWar(player1,player2);
        }
    }

    /**
     * The method makes the players put 3 cards and check the last cards
     * if they are equal, they keep playing one card each until different cards
     * @param player1
     * @param player2
     */
    static void stateOfWar(Player player1, Player player2){
        int wonCards=2;
        for (int i = 0; i < 3; i++) {
            Card card1=player1.playACard();
            Card card2=player2.playACard();
            wonCards+=2;
            if(i==2){
                if(card1.getStrengthValue()>card2.getStrengthValue()){
                    player1.setWonDeck(player1.getWonDeck()+wonCards);
                }else if(card1.getStrengthValue()<card2.getStrengthValue()){
                    player2.setWonDeck(player2.getWonDeck()+wonCards);
                }else{
                    do{
                        checkWinningCard(player1, player2, 2);
                    }while(player1.getStartDeck().length>0&&player2.getStartDeck().length>0);
                }
            }
        }
    }
}



