import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Deck of Cards Menu =====");
            System.out.println("1. Print Deck");
            System.out.println("2. Print a Card");
            System.out.println("3. Print Cards of the Same Suit");
            System.out.println("4. Compare Two Cards");
            System.out.println("5. Find a Card");
            System.out.println("6. Deal 5 Random Cards");
            System.out.println("7. Shuffle Deck");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    System.out.print("Enter rank: ");
                    String rank = scanner.next();
                    System.out.print("Enter suit: ");
                    String suit = scanner.next();

                    Card foundCard = deck.findCard(rank, suit);
                    deck.printCard(foundCard);
                    break;
                case 3:
                    System.out.print("Enter suit: ");
                    String suitOnly = scanner.next();
                    deck.sameCard(suitOnly);
                    break;
                case 4:
                    System.out.print("Enter first card rank: ");
                    String rank1 = scanner.next();
                    System.out.print("Enter first card suit: ");
                    String suit1 = scanner.next();
                    Card card1 = deck.findCard(rank1, suit1);

                    System.out.print("Enter second card rank: ");
                    String rank2 = scanner.next();
                    System.out.print("Enter second card suit: ");
                    String suit2 = scanner.next();
                    Card card2 = deck.findCard(rank2, suit2);

                    if (card1 != null && card2 != null) {
                        deck.compareCard(card1, card2);
                    } else {
                        System.out.println("One or both cards not found!");
                    }
                    break;
                case 5:
                    System.out.print("Enter rank: ");
                    String searchRank = scanner.next();
                    System.out.print("Enter suit: ");
                    String searchSuit = scanner.next();
                    deck.printCard(deck.findCard(searchRank, searchSuit));
                    break;
                case 6:
                    deck.dealCard();
                    break;
                case 7:
                    deck.shuffleDeck();
                    break;
                case 8:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 8.");
            }
        } while (choice != 8);

        scanner.close();
    }
}
