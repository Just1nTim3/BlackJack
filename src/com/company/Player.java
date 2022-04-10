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
        System.out.println("Your hand: " + hand.toString());
        System.out.println("Your hand value is: " + getHandValue());
    }

    @Override
    public void clearHand()
    {
        hand.clear();
    }

    @Override
    public int getHandValue()
    {
        int value = 0;
        for(String card: hand)
        {
            if(card.equals("J") || card.equals("Q") || card.equals("K"))
            {
                value = value + 10;
            }
            else if(card.equals("A"))
            {
                value = value + 11;
            }
            else   //if card isn't J,Q,K or A then it must be 1-10, so we just take its value as an integer
            {
                value = value + Integer.parseInt(card);
            }
        }
        return value;
    }

    public ArrayList<String> getHand()
    {
        return hand;
    }

}
