/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blanket;

import java.util.List;

/**
 *
 * @author anmol
 */
class MemoryGameRules implements GameRules {

   @Override
   public boolean isGameOver(Deck deck) {
       return deck.size() == 0; // Game over when no cards are left in the deck.
   }

   @Override
   public void handleTurn(Player currentPlayer, Deck deck, List<Card> revealedCards, TurnManager turnManager) { // Accept TurnManager as parameter.
       System.out.println("\n" + currentPlayer.getName() + "'s turn!");
       
       // Get the chosen card index from the player.
       int chosenIndex = currentPlayer.chooseCard(deck);

       // Peek at the chosen card.
       Card chosenCard = deck.peekCard(chosenIndex);

       System.out.println(currentPlayer.getName() + " chose: " + chosenCard);

       // Check for matches in revealed cards.
       boolean matchFound = false;

       for (int i = 0; i < revealedCards.size(); i++) {
           if (chosenCard.equals(revealedCards.get(i))) { // Check for a match.
               matchFound = true;
               revealedCards.remove(i); // Remove matched card from revealed cards.
               currentPlayer.incrementMatchingPairs(); // Increment player's score.
               System.out.println("Match found! " + currentPlayer.getName() + " gets a point.");
               break; // Exit loop after finding a match.
           }
       }

       if (!matchFound) { 
           revealedCards.add(chosenCard); // Add unmatched card to revealed cards.
           System.out.println("No match! The card has been added to revealed cards.");
       } else { 
           System.out.println(currentPlayer.getName() + " can continue choosing another card.");
           handleTurn(currentPlayer, deck, revealedCards, turnManager); // Allow player to continue their turn if they found a match.
       }
       
       // Display current score after each turn for all players
       System.out.println("\nCurrent Scores:");
       for (Player player : turnManager.getPlayers()) { 
           System.out.println(player.getName() + "'s current score: " + player.getMatchingPairs());
       }
       
   }

   @Override
   public void declareWinner(List<Player> players) { 
      Player winner = null; 
      int maxPairs = 0; 

      System.out.println("\nGame Over! Final scores:"); 
      
      for (Player player : players) { 
          System.out.println(player.getName() + ": " + player.getMatchingPairs() + " pairs"); 
          if (player.getMatchingPairs() > maxPairs) { 
              maxPairs = player.getMatchingPairs(); 
              winner = player; 
          } 
      } 
      
      if (winner != null) { 
          System.out.println("The winner is " + winner.getName() + " with " + maxPairs + " pairs!"); 
      } else { 
          System.out.println("It's a tie!"); 
      } 
  } 
}