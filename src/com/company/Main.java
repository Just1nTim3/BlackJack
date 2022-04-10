package com.company;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class Main
{
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args)
    {
        int won = 0;
        int lost = 0;

        Deck deck = new Deck();
        Player player = new Player();
        Dealer dealer = new Dealer();

        // game begins //

        while(true)
        {
            // initialization of game - 2 cards are added to dealer and player, dealer shows only 1 card and player can cee both of his cards
            System.out.println("//////////////////////////////////////////////////");
            System.out.println("New game starts!");
            System.out.println("//////////////////////////////////////////////////");
            System.out.println();
            deck.shuffleCards();

            dealer.clearHand();
            player.clearHand();

            dealer.addCard(deck.takeCards());
            dealer.addCard(deck.takeCards());
            dealer.showCard();

            player.addCard(deck.takeCards());
            player.addCard(deck.takeCards());
            player.showHand();

            while(player.getHandValue() < 22)
            {
                System.out.println("Do you want to take another card? [yes/no]");
                if(!getAnswer())
                    break;
                else
                {
                    player.addCard(deck.takeCards());
                    player.showHand();
                }

            }


            dealer.showHand();
            System.out.println();
            player.showHand();
            System.out.println();

            while(dealer.getHandValue() < 17)
            {
                System.out.println("dealer is adding card to his hand");
                dealer.addCard(deck.takeCards());
            }
            dealer.showHand();
            System.out.println();
            player.showHand();

            if(player.getHandValue() > 21 || (player.getHandValue() < dealer.getHandValue() && dealer.getHandValue() <= 21))
            {
                System.out.println("You lost :c");
                lost++;
            }
            else if(player.getHandValue() > dealer.getHandValue() || dealer.getHandValue() > 21)
            {
                System.out.println("You won!");
                won++;
            }
            else if(player.getHandValue() == dealer.getHandValue())
            {
                System.out.println("It's a draw :) ");
            }

            System.out.println("Your score is: " + won + " games won and " + lost + " games lost");

            System.out.println("Do you want to play another game? [yes/no]");

            if(!getAnswer())
            {
                break;
            }
        }
    }

    public static boolean getAnswer()
    {
        boolean answer = false;

        while(true)
        {
            String userInput = "";
            try
            {
                userInput = scanner.nextLine().toLowerCase(Locale.ROOT);
                if(userInput.equals("no"))
                {
                    break;
                }
                else if(userInput.equals("yes"))
                {
                    answer = true;
                    break;
                }
                else
                {
                    System.out.println("Make sure you typed your answer correctly [yes/no]");
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("Make sure to enter \"yes\" or \"no\"");
            }
        }
        return answer;
    }
}
