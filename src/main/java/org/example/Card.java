package org.example;

enum Colour {
    SPADES,
    CLUBS,
    HEARTS,
    DIAMONDS,
}

enum Value {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14);

    private final int value;

    private Value(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Card {
    int colour;
    int value;

    public Card(int colour, int value) {
        this.colour = colour;
        this.value = value;
    }

    public void display() {
        printColor(this);
        printValue(this);
    }

    public void printColor(Card card) {
        switch(card.colour) {
            case 0:
                System.out.print("SPADES "); break;
            case 1:
                System.out.print("CLUBS "); break;
            case 2:
                System.out.print("HEARTS "); break;
            case 3:
                System.out.print("DIAMONDS "); break;
        }
    }

    public void printValue(Card card) {
        switch(card.value) {
            case 11:
                System.out.print(" JACK"); break;
            case 12:
                System.out.print(" QUEEN"); break;
            case 13:
                System.out.print(" KING"); break;
            case 14:
                System.out.print(" ACE"); break;
            default:
                System.out.println(" " + card.value); break;
        }
    }
}
