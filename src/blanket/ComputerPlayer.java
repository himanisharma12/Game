/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blanket;

import java.util.Random;

/**
 *
 * @author anmol
 */
class ComputerPlayer extends AbstractPlayer {

   public ComputerPlayer(String name) {
       super(name);
   }

   @Override
   public int chooseCard(Deck deck) {
       Random random = new Random();
       int chosenIndex = random.nextInt(deck.size());
       System.out.println(name + " chose card at index " + chosenIndex);
       return chosenIndex; // Return the chosen index.
   }
}
