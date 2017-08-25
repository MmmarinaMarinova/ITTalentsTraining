package Lesson14;

/**
 * Created by Marina on 12.7.2017 г..
 */
public class Card {
    private char strength;
    private int strengthValue;

    public Card() {
    }

    //copy constructor
    public Card( Card newCard){
        if(newCard==null){
            return;
        }
        this.strength=newCard.getStrength();
        this.strengthValue=newCard.getStrengthValue();
    }

    public char getStrength() { return this.strength; }

    public void setStrength(char strength) {
        this.strength = strength;
    }

    public int getStrengthValue() {
        return this.strengthValue;
    }

    public void setStrengthValue(int strengthValue) {
        this.strengthValue = strengthValue;
    }


}
