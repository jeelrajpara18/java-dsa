package OOPS;

import java.util.Scanner;

public class FrenchCard {
    private char cardValue;
    private String cardSuit;

    public FrenchCard(char cardValue , String cardSuit){
        this.cardValue = cardValue;
        this.cardSuit = cardSuit.toLowerCase();
    }
    
    public char getValue(){
        return cardValue;
    }

    public String getSuit(){
        return cardSuit;
    }
    
    public boolean hasSameValue(FrenchCard other){
        return this.cardValue == other.cardValue;
    }

    public boolean hasSameSuit(FrenchCard other){
        return this.cardSuit == other.cardSuit;
    }
    
    public String getSuitColor(){
        if(cardSuit.equals("diamonds") || cardSuit.equals("hearts")){
            return "color : red";
        } 
        else if(cardSuit.equals("clubs") || cardSuit.equals("spade")){
            return "color : black";
        }
        return "color : unknown";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of first card : ");
        char value1 = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Enter the suit of first card : ");
        String cardSuit1 = sc.nextLine();
        
        System.out.print("Enter the value of second card : ");
        char value2 = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Enter the suit of second card : ");
        String cardSuit2 = sc.nextLine();

        FrenchCard card1 = new FrenchCard(value1, cardSuit1);
        FrenchCard card2 = new FrenchCard(value2, cardSuit2);

        if(card1.hasSameSuit(card2)){
            System.out.println("Has Same Suit");
        }
        else if(card1.hasSameValue(card2)){
            System.out.println("Hase Same Value");
        }
        else{
            System.out.println("Does not have same suit or value");
        }
        System.out.println(card1.getSuitColor());
        sc.close();
    }
}


/* French playing cards is the most common deck of playing cards used today. In a pack,there are totally 54 cards. It includes thirteen cards of each of the four French suits: clubs (♣), diamonds (♦), hearts (♥) and spades (♠).

Each card has the following printed on it:

(i) Value in the card

(ii) Suit Symbol

Design a class to represent, a french card and provide functions to check if two cards has same value, two cards have same suite and a function to print the suite color of the card.

Value of the card is given as a character (A, 2 to 9, T, K, Q, J, O)

A - Represents Ace equivalent to 1

2 to 9 - Represent cards with value 2 to 9

T - Represent cards with value 10

K - Represent cards with king

Q - Represent cards with queen

J - Represent cards with jack

O - Represent cards with joker

(ii) Suite of the card is given as either one of the following: clubs, diamonds, hearts, spades

Input Format

First line contains a letter representing the value of the first card

Second line contains the suite of the first card

Third line contains a letter representing the value of the second card

Fourth line contains the suite of the second card

Output Format

In the first line, print ‘Same value’, if the value of the cards are same or print ‘Same suite’, if the suite of the cards are same

In the second line, print color of the suite of the first card. Print ‘red’ if the suite is diamonds or hearts and print ‘black’ if the suite is clubs or spades */