/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painosovellus;

/**
 *
 */
import java.text.ParseException;
import java.util.Scanner;
//import java.util.ArrayList;

public class PainoSovellus {
    
    public void tulostaValikko() {
        System.out.println("Valikko");
        System.out.println("0) Lopeta");
        System.out.println("1) Lisää painokirjaus menneelle päivälle");
        System.out.println("2) Tulosta painokuvaaja");
        System.out.println("3) Lisää painokirjaus tälle päivälle");
        System.out.println("Anna valintasi (0, 1, 2 tai 3):");
    }

    public static void main(String[] args) throws ParseException, Exception {
        Scanner lukija = new Scanner(System.in);
        TiedostoTyokalut mittaukset = new TiedostoTyokalut();
        // Alustetaan tiedosto
        mittaukset.tyhjennaTiedosto();
        PainoSovellus sovellus = new PainoSovellus();

        OUTER:        
        while (true) {
            sovellus.tulostaValikko();
            int luettu = Integer.valueOf(lukija.nextLine());
            switch (luettu) {
                case 0:
                    break OUTER;
                case 1:
                    {
                        System.out.println("Anna paino (muodossa 9.9.2019,85): ");
                        String luettava = lukija.nextLine();
                        mittaukset.lisaaMittausFeed(luettava);
                        mittaukset.kirjoitaTiedostoon();
                        break;
                    }
                case 3:
                    {
                        System.out.println("Anna paino (muodossa 85): ");
                        String luettava = lukija.nextLine();
                        Pvm paiva = new Pvm();
                        mittaukset.lisaaMittausFeed(paiva.toString() + "," + luettava);
                        mittaukset.kirjoitaTiedostoon();
                        break;
                    }
                case 2:
                    {
                        //ArrayList<PainoMittaus> mittausListaTiedostosta = mittaukset.getMittauksetTiedostosta();
                        //Piirturi piirturi = new Piirturi(mittausListaTiedostosta);
                        //piirturi.tulostaPainoKuvaaja();
                        
                        mittaukset.getMittauksetTiedostosta();
                        PainoMittaus[] mittausLista = mittaukset.lue();
                        Piirturi piirturi = new Piirturi(mittausLista);
                        System.out.println("Piirretään painot");
                        
                        piirturi.tulostaPainoKuvaaja();
                        break;
                    }
                case 9:
                    {
                        // TYHJENNÄ TIEDOSTO
                        mittaukset.tyhjennaTiedosto();
                        break;
                    }
                default:
                    break;
            }
        }

        System.out.println("");     
    }
}
