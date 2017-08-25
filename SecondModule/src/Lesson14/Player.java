package Lesson14;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

/**
 * Created by Marina on 12.7.2017 г..
 */
public class Player {
    private Card[] startDeck;
    private int wonDeck;
    private String name;

    public Player() {
    }

    public Player(String name) {
        startDeck=new Card[26];
        wonDeck=0;
        this.name = name;
    }

    public Player(Card[] startDeck, String name) {
        this.startDeck = startDeck;
        this.wonDeck = 0;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card[] getStartDeck() {
        return this.startDeck;
    }

    public void setStartDeck(Card[] startDeck) {
        this.startDeck = startDeck;
    }

    public int getWonDeck() {
        return this.wonDeck;
    }

    public void setWonDeck(int wonDeck) {
        this.wonDeck = wonDeck;
    }

    /**
     * A method that puts out a card of the player's deck and then deletes it from the array
     * @return Card that is the first in the deck
     */
    public Card playACard() {
        Card cardToPlay=this.startDeck[0];
        this.startDeck = Arrays.copyOfRange(this.startDeck,1,this.startDeck.length);
        return cardToPlay;
    }
}
