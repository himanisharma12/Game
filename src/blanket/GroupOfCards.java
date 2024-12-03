/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blanket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author anmol
 */
class GroupOfCards implements Deck {
    private final List<Card> cards;

    public GroupOfCards() {
        this.cards = new ArrayList<>();
    }

    @Override
    public void addCard(Card card) {
        cards.add(card);
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public Card drawCard(int index) {
        return cards.remove(index);
    }

    @Override
    public Card peekCard(int index) {
        return cards.get(index);
    }

    @Override
    public int size() {
        return cards.size();
    }
}
