/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blanket;

import java.util.Scanner;

/**
 *
 * @author anmol
 */
class HumanPlayer extends AbstractPlayer {
   private final Scanner scanner;

   public HumanPlayer(String name) {
       super(name);
       scanner = new Scanner(System.in);
   }

   @Override
   public int chooseCard(Deck deck) {
       System.out.println(name + ", choose a card index:");
       int chosenIndex = scanner.nextInt();
       return chosenIndex; // Return the chosen index.
   }
}