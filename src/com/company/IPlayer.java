package com.company;

import java.util.ArrayList;

public interface IPlayer
{
    public void addCard(ArrayList<String> cards);

    public void removeCard(ArrayList<String> cards);

    public void showHand();

    public int getHandValue();

    public void clearHand();

}
