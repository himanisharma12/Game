/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blanket;

/**
 *
 * @author anmol
 */

abstract class AbstractPlayer implements Player {
    protected final String name;
    protected int matchingPairs;

    public AbstractPlayer(String name) {
        this.name = name;
        this.matchingPairs = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMatchingPairs() {
        return matchingPairs;
    }

    @Override
    public void incrementMatchingPairs() {
        matchingPairs++;
    }
}