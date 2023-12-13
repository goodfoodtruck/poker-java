package org.example;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        int players = 5;

        Hand hand = new Hand(deck.cards);

        hand.displayHand();

    }
}