package BJ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new BlackJack(new Scanner(System.in), new Desk(AllCards.CARDS_52)).start();
    }
}
