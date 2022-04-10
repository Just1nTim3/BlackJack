package com.company;

import java.util.ArrayList;

public interface IPlayer
{
    void addCard(ArrayList<String> cards);

    void removeCard(ArrayList<String> cards);

    void showHand();

    int getHandValue();

    void clearHand();

}
