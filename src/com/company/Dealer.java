package com.company;


public class Dealer extends Player
{

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
