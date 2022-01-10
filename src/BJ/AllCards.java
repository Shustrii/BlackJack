package BJ;

import java.util.ArrayList;
import java.util.List;

public enum AllCards {
    CARDS_52(0);

    private final static String[] SUITS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private final static int[] RANK = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

    private int position;

    AllCards(int position){
        this.position = position;
    }

    public List<Card> fillCards(){
        List<Card> cards = new ArrayList<>();
        for (Signs signs: Signs.values()){
            for (int index = this.position; index<SUITS.length; index++){
                cards.add(new Card(SUITS[index],RANK[index], signs ));
            }
        }
        return cards;
    }
}
