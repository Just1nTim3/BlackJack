package com.company;

import java.util.ArrayList;

public class Dealer extends Player
{
    //private ArrayList<String> hand = new ArrayList<>();

    public void showCard()
    {
        System.out.println("Dealer: ");
        System.out.println("Dealer's hand: [ " + getHand().get(0) +  " _ ]");
    }

    @Override
    public void showHand()
    {
        System.out.println("Dealer's hand: " + getHand().toString());
        System.out.println("Dealer's hand value is: " + getHandValue());
    }
}
