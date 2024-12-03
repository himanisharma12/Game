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
class TurnManager {
   private final List<Player> players;
   private int currentPlayerIndex;

   public TurnManager(List<Player> players) {
       this.players = players;
       this.currentPlayerIndex = 0;
   }

   public Player getCurrentPlayer() {
       return players.get(currentPlayerIndex);
   }

   public void nextPlayer() {
       currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
   }

   public List<Player> getPlayers() { // Return the list of players.
       return players;
   }
}
