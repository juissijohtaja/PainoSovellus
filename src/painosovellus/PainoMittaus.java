/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painosovellus;

import java.util.Date;

/**
 *
 */
public class PainoMittaus {
    private int paino;
    private Pvm pvm;

    public PainoMittaus(int paino, Pvm pvm) {
        this.paino = paino;
        this.pvm = pvm;
    }
    
    public PainoMittaus(int paino) {
        this.paino = paino;
        this.pvm = new Pvm();;
    }

    public int getPaino() {
        return paino;
    }

    public Date getPaivamaara() {
        return pvm.getPaivamaara();
    }
    
    public String getPaivamaaraFormatted() {
        return pvm.toString();
    }

    @Override
    public String toString() {
        return pvm.toString() + "," + paino;
    }  
}
