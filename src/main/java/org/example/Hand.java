package org.example;

import java.util.*;

public class Hand {
    List<Card> cards;
    Map<Integer, Integer> mapValues;
    Map<Integer, Integer> mapColours;

    public Hand(List<Card> deck) {
        this.cards = new ArrayList();
        this.mapValues = new HashMap();
        this.mapColours = new HashMap();

        for (int i = 0; i < 5; i++) {
            Card card = deck.get(new Random().nextInt(deck.size()));
            deck.remove(card);
            cards.add(card);
            this.mapValues.merge(card.value, 1, Integer::sum);
            this.mapColours.merge(card.colour, 1, Integer::sum);
        }

        for (Map.Entry<Integer, Integer> entry : this.mapValues.entrySet()) {
            System.out.println("Valeur : " + entry.getKey() + ", Occurrences : " + entry.getValue());
        }

        for (Map.Entry<Integer, Integer> entry : this.mapColours.entrySet()) {
            System.out.println("Colours : " + entry.getKey() + ", Occurrences : " + entry.getValue());
        }
    }

    public void displayHand() {
        for (Card card : this.cards) {
            card.display();
        }
    }

    public static void incrementHashmap(Map<String, Integer> map, String key) {
        map.put(key, map.getOrDefault(key, 0) + 1);
    }
}