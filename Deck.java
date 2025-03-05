import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;

    // Constructor to create a deck
    public Deck() {
        deck = new ArrayList<>();
        createDeck();
    }

    // a) Create a deck of 52 cards
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    // b) Print all cards in the deck
    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    // c) Print a specific card
    public void printCard(Card card) {
        if (card != null) {
            System.out.println("Selected Card: " + card);
        } else {
            System.out.println("Card not found!");
        }
    }

    // d) Print all cards of the same suit
    public void sameCard(String suit) {
        System.out.println("Cards of the same suit (" + suit + "):");
        boolean found = false;
        for (Card card : deck) {
            if (card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println(card);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cards found for the suit: " + suit);
        }
    }

    // e) Compare two cards to check if they have the same rank
    public void compareCard(Card c1, Card c2) {
        if (c1.getRank().equalsIgnoreCase(c2.getRank())) {
            System.out.println("Both cards have the same rank: " + c1.getRank());
        } else {
            System.out.println("Cards have different ranks.");
        }
    }

    // f) Find a specific card
    public Card findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.getRank().equalsIgnoreCase(rank) && card.getSuit().equalsIgnoreCase(suit)) {
                return card;
            }
        }
        return null;
    }

    // g) Deal 5 random cards
    public void dealCard() {
        Random rand = new Random();
        System.out.println("Dealing 5 Random Cards:");
        for (int i = 0; i < 5; i++) {
            int randomIndex = rand.nextInt(deck.size());
            System.out.println(deck.get(randomIndex));
        }
    }

    // h) Shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled successfully!");
    }
}
