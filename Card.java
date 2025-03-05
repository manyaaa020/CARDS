public class Card {
    private String rank;
    private String suit;

    // Constructor to initialize a card
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Getters for rank and suit
    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    // Display card details
    public String toString() {
        return rank + " of " + suit;
    }
}
