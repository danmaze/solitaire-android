package com.droidcluster.solitaire.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    @Test
    public void shuffleTest() {
        Deck deck = new Deck(Card.T1, Card.T2, Card.T3, Card.T4);
        Deck deckCopy = new Deck(Card.T1, Card.T2, Card.T3, Card.T4);
        assertEquals(deck, deckCopy);
        deck.shuffle();
        assertNotEquals(deck, deckCopy);
    }

    @Test
    public void reverseTest() {

    }

    @Test
    public void clear() {
    }

    @Test
    public void addCard() {
    }

    @Test
    public void takeFromFirstTest() {
        Deck deck = new Deck(Card.T1, Card.T2, Card.T3, Card.T4);
        Deck otherDeck = new Deck(Card.H1, Card.H2, Card.H3, Card.H4);
        deck.takeFromFirst(2, otherDeck);
        System.out.println(deck.toString());
        System.out.println(otherDeck.toString());
        System.out.println("No. of cards: " + deck.getCardsCount() + ", Open cards count: " + deck.getOpenCardsCount());
        System.out.println("No. of cards: " + otherDeck.getCardsCount() + ", Open cards count: " + otherDeck.getOpenCardsCount());
    }

    @Test
    public void copyToFirstTest() {
        Deck deck = new Deck(Card.T1, Card.T2, Card.T3, Card.T4);
        Deck otherDeck = new Deck(Card.H1, Card.H2, Card.H3, Card.H4);
        deck.copyToFirst(otherDeck);
        System.out.println(deck.toString());
        System.out.println(otherDeck.toString());
        System.out.println("No. of cards: " + deck.getCardsCount() + ", Open cards count: " + deck.getOpenCardsCount());
        System.out.println("No. of cards: " + otherDeck.getCardsCount() + ", Open cards count: " + otherDeck.getOpenCardsCount());
    }

    @Test
    public void putFirstTest() {
        Deck deck = new Deck(Card.T1, Card.T2, Card.T3, Card.T4);
        Deck otherDeck = new Deck(Card.H1, Card.H2, Card.H3, Card.H4);
        deck.putFirst(otherDeck);
        System.out.println(deck.toString());
        System.out.println(otherDeck.toString());
        System.out.println("No. of cards: " + deck.getCardsCount() + ", Open cards count: " + deck.getOpenCardsCount());
        System.out.println("No. of cards: " + otherDeck.getCardsCount() + ", Open cards count: " + otherDeck.getOpenCardsCount());
    }

    @Test
    public void getCardAt() {
    }

    @Test
    public void isCardOpen() {
    }

    @Test
    public void getCardsCount() {
    }

    @Test
    public void getOpenCardsCount() {
    }

    @Test
    public void getCardsAsListTest() {
    }

    @Test
    public void setOpenCardsCount() {
    }

    @Test
    public void equals() {
    }

    @Test
    public void hashCodeTest() {
    }

    @Test
    public void toStringTest() {
    }
}