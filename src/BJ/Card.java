package BJ;

public class Card {
    private final String suit;
    private final int rank;
    private final Signs signs;

    public Card(String suit, int rank, Signs signs) {
        this.suit = suit;
        this.rank = rank;
        this.signs = signs;
    }

    public String getSuit() {
        return suit;
    }


    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank=" + rank +
                ", signs=" + signs +
                '}';
    }
}
