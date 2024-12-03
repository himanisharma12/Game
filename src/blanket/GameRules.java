/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package blanket;

import java.util.List;

/**
 *
 * @author anmol
 */
interface GameRules {
   boolean isGameOver(Deck deck);
   void handleTurn(Player currentPlayer, Deck deck, List<Card> revealedCards, TurnManager turnManager); // Pass TurnManager as a parameter.
   void declareWinner(List<Player> players); // Ensure this method is correctly defined.
}
