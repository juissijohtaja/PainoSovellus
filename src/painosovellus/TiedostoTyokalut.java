/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painosovellus;

/**
 *
 */

import java.io.File;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TiedostoTyokalut {
    private ArrayList<PainoMittaus> mittaukset;
    private ArrayList<String> mittauksetFeed;

    public TiedostoTyokalut() {
        this.mittaukset = new ArrayList<>();
        this.mittauksetFeed = new ArrayList<>();
    }
    
    public void lisaaMittaus(PainoMittaus mittaus) {
        this.mittaukset.add(mittaus);
    }
    
    public void lisaaMittausFeed(String mittaus) {
        this.mittauksetFeed.add(mittaus);
    }

    public ArrayList<PainoMittaus> getMittaukset() {
        return mittaukset;
    }
    
    public ArrayList<PainoMittaus> getMittauksetSorted() {
        // Sort in assending order
        Collections.sort(mittaukset, new Comparator<PainoMittaus>() {
            public int compare(PainoMittaus p1, PainoMittaus p2) {
                return Long.valueOf(p1.getPaivamaara().getTime()).compareTo(p2.getPaivamaara().getTime());
            }
        });
        return mittaukset;
    }
    
    public ArrayList<PainoMittaus> getMittauksetTiedostosta() throws ParseException {
        ArrayList<String> rivit = new ArrayList<>();

        // luodaan lukija tiedoston lukemista varten
        try (Scanner tiedostonLukija = new Scanner(new File("mittaukset.txt"))) {

            // luetaan kaikki tiedoston rivit
            while (tiedostonLukija.hasNextLine()) {
                rivit.add(tiedostonLukija.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

        // tee jotain luetuilla riveillä
        this.mittaukset.clear();
        
        for (int i=0; i<rivit.size(); i++) {
            String rivi = rivit.get(i);
            String[] splitPaino = rivi.split(",");
            
            int luettuPaino = Integer.valueOf(splitPaino[1]);
            String luettuPaivays = splitPaino[0];
            String[] splitPaivays = luettuPaivays.split("\\.");
            int day = Integer.valueOf(splitPaivays[0]);
            int month = Integer.valueOf(splitPaivays[1]);
            int year = Integer.valueOf(splitPaivays[2]);
            Pvm paiva = new Pvm(day, month, year);
            PainoMittaus mittaus = new PainoMittaus(luettuPaino, paiva);
            lisaaMittaus(mittaus);
        }
        
        return this.getMittauksetSorted();
    }
    
    public void kirjoitaTiedostoon() throws Exception {
        PrintWriter kirjoittaja = new PrintWriter("mittaukset.txt");
        for (int i=0; i < mittauksetFeed.size(); i++) {
            String teksti = mittauksetFeed.get(i);
            kirjoittaja.println(teksti);
        }
        kirjoittaja.close();
    }
    
    public void tyhjennaTiedosto() throws Exception {
        this.mittaukset.clear();
        this.mittauksetFeed.clear();
        PrintWriter kirjoittaja = new PrintWriter("mittaukset.txt");
        kirjoittaja.print("");
        kirjoittaja.close();
    }
    
    public PainoMittaus[] lue() {
        PainoMittaus[] uusiLista = mittaukset.toArray(new PainoMittaus[mittaukset.size()]); 
        return uusiLista;
    }

    @Override
    public String toString() {
        return "TiedostoTyokalut{" + "mittaukset=" + mittaukset + '}';
    }
}
