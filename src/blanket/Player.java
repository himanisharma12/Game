/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package blanket;

/**
 *
 * @author anmol
 */
interface Player {
    String getName();
    int getMatchingPairs();
    void incrementMatchingPairs();
    int chooseCard(Deck deck);
}