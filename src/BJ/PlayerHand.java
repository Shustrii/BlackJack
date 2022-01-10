package BJ;

import java.util.ArrayList;
import java.util.Arrays;


public class PlayerHand {
    private final ArrayList<Card> cards;
    private final Desk desk;
    private int position;

    public PlayerHand(Desk desk) {
        this.cards = new ArrayList<>();
        this.desk = desk;
    }

    void continueGame(){
        this.position = this.cards.size();
    }

    void getCard(){
        this.cards.add(this.desk.getCard());
    }
    private boolean isTwoJokers(){
        int count = 0;
        for (Card card : getCardsThisGame()){
            if (card.getSuit().toLowerCase().equals("ace")){
                count++;
            }
        }
        return count>=2;
    }

    boolean isBlackJack(){
        Card[] array = getCardsThisGame();
        return array.length == 2  && getSum() == 21 && !array[0].getSuit().equals("10") && !array[1].getSuit().equals("10");
    }
    int getSum() {
        int sum = 0;
        for (Card card : getCardsThisGame()) {
            sum += card.getRank();
        }
        if (isTwoJokers()) {
            sum -= 10;
        }
        return sum;
    }

    private Card[] getCardsThisGame() {
        Card[] array = new Card[this.cards.size() - this.position];
        for (int index = this.position; index < this.cards.size(); index++) {
            array[index - this.position] = this.cards.get(index);
        }
        return array;
    }
    @Override
    public String toString() {
        return Arrays.toString(getCardsThisGame());
    }
}
