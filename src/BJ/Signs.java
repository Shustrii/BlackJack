package BJ;

public enum Signs {
    CLUB('♣'),DIAMOND('♦'),HEART('♥'),SPADE('♠');

    final char singsOfCard;

    Signs(char singsOfCard) {
        this.singsOfCard = singsOfCard;
    }

    @Override
    public String toString() {
        return String.valueOf(this.singsOfCard);
    }
}
