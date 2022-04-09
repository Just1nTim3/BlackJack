package com.company;
import java.util.ArrayList;
import java.util.Collections;


public class Deck implements IDeck
{
    private ArrayList<String> cards = new ArrayList<>();
    private final String[] cardsArray=    {
                            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A",
                            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A",
                            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A",
                            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"
                            };



    @Override
    public void shuffleCards()
    {
        for(String card: cardsArray)
        {
            cards.add(card);
        }

        Collections.shuffle(cards);
    }

    public ArrayList<String> takeCards()
    {
        return cards;
    }

    @Override
    public String toString()
    {
        return cards.toString();
    }

}
