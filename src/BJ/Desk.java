package BJ;

import java.util.ArrayList;
import java.util.Random;


public class Desk {
    private ArrayList<Card> cards;
    private final int lenghtL;

    public Desk(AllCards allCards) {
        this.cards = (ArrayList<Card>) allCards.fillCards();
        this.lenghtL = this.cards.size();
    }

    Card getCard(){
        Card card = null;
        if(!this.cards.isEmpty()){
            card = this.cards.remove(0);
        }
        return card;
    }
    int allCards(){
        return this.cards.size();
    }

    void hashCards(){
        if(!this.cards.isEmpty()){
            Random random = new Random();
            ArrayList<Card> hashCard = new ArrayList<>();
            while (!this.cards.isEmpty()){
                int index = random.nextInt(this.cards.size());
                hashCard.add(this.cards.remove(index));
            }
            this.cards = hashCard;
        }
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Cards to pack: ");
        int count = 0;
        for (Card card : this.cards){
            stringBuffer.append(card);
            if (count < this.lenghtL){
                stringBuffer.append(", ");
                count++;
            }else {
                stringBuffer.append("\n ");
                count = 0;
            }
        }
        return stringBuffer.toString();
    }
}
