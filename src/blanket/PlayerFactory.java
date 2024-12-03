/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blanket;

/**
 *
 * @author anmol
 */
class PlayerFactory {
   public static Player createPlayer(String name, boolean isComputer) {
       return isComputer ? new ComputerPlayer(name) : new HumanPlayer(name);
   }
}
