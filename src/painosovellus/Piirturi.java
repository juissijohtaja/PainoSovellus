/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painosovellus;

import java.util.ArrayList;

/**
 *
 */


public class Piirturi {
    private ArrayList<PainoMittaus> mittausLista;
    private PainoMittaus[] mittausListaArray;

    public Piirturi(ArrayList<PainoMittaus> mittausLista) {
        this.mittausLista = mittausLista;
    }
    
    public Piirturi(PainoMittaus[] mittausListaArray) {
        this.mittausListaArray = mittausListaArray;
    }
    
    public void tulostaPainoKuvaaja() {
        int painoMin = this.getPainoMin();
        int aloitusPaino = painoMin - 10;
        //int aloitusPaino = 40;
        for (int i=0; i < mittausListaArray.length; i++) {
            System.out.print(mittausListaArray[i].getPaino() + " - " + mittausListaArray[i].getPaivamaaraFormatted() + ": ");
            int paino = mittausListaArray[i].getPaino();
            for (int j=aloitusPaino; j < paino; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
    
    public int getPainoMin() {
        int minPaino = mittausListaArray[0].getPaino();
        for (int i=0; i < mittausListaArray.length; i++) {
            int verrattava = mittausListaArray[i].getPaino();
            if (verrattava < minPaino) {
                minPaino = verrattava;
            }
        }
        return minPaino;
    }
    
//    public void tulostaPainoKuvaajaAlt() {
//        int painoMin = this.getPainoMin();
//        int aloitusPaino = painoMin - 10;
//        for (int i=0; i < mittausListaArray.length; i++) {
//            System.out.print(mittausListaArray[i].getPaino() + " - " + mittausListaArray[i].getPaivamaaraFormatted() + ": ");
//            int paino = mittausListaArray[i].getPaino();
//            for (int j=aloitusPaino; j < paino; j++) {
//                System.out.print("#");
//            }
//            System.out.println("");
//        }
//    }
    
}
