package com.company;
import java.util.ArrayList;


public class Player implements IPlayer
{
    private ArrayList<String> hand = new ArrayList<>();

    @Override
    public void addCard(ArrayList<String> cards)
    {
        hand.add(cards.get(0));             //adds card to player hand
        removeCard(cards);
    }

    @Override
    public void removeCard(ArrayList<String> cards)
    {
        cards.remove(0);              //removes card taken by player from deck
    }

    @Override
    public void showHand()
    {
        System.out.println(hand.toString());
    }

}
