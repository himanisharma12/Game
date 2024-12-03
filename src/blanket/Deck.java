/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package blanket;

/**
 *
 * @author anmol
 */
interface Deck {
    void addCard(Card card);
    void shuffle();
    Card drawCard(int index);
    Card peekCard(int index);
    int size();
}