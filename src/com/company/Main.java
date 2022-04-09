package com.company;

public class Main {

    public static void main(String[] args)
    {
        Deck deck = new Deck();
        Player player = new Player();

        System.out.println(deck.toString());
        deck.shuffleCards();
        System.out.println(deck.toString());

        player.addCard(deck.takeCards());

        System.out.println(deck.toString());


    }
}
