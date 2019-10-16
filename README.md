# PainoSovellus

Tee painonhallintasovellus

Tarkoituksena on, että sovellukseen voi noin päivittäin syöttää oman painonsa ja painot tallentuvat myös tiedostoon. Painokehityksestä saa niin sanotulla ASCII grafiikalla piirrettyä kuvaajia käyttäen # merkkiä piirtosymbolina. Kuvassa uusimmat mittaukset näkyvät alimpana. Päivämäärät merkitään muodossa 9.9.2019.

*************

Tee seuraavat luokat:

PainoSovellus
Sisältää ohjelman valikon tulostamisen silmukassa.

PainoMittaus
Mallintaa yhtä painomittausta model-luokka, joka sisältää päivämäärän ja varsinaisen painon kiloina. Päivämäärä on luettavissa ja tuotettavissa Pvm-luokan avulla.

Pvm
Pvm-luokka, jossa on attribuutit paiva, kuukausi ja vuosi. Konstruktorin kautta voidaan luoda päivämäärä, jonka arvoksi tulee automaattisesti tällähetkellä kuluva päivä.

Piirturi
Luokka, joka kykenee skaalautuvasti tuottamaan näyttöä sopivasti käyttävän kuvaajan perustuen annettuun tietoon.

TiedostoTyokalut
Luokka, joka kykenee kirjoittamaan tiedostoon talteen mitattuja painoja.

**************

Toteuta PainoSovellus-luokkaan metodi:
public void tulostaValikko()

Metodi tulostaa numeroilla valittavan valikon.

Toteuta Piirturi-luokkaan metodi:
tulostaPainoKuvaaja()

Metodi tulostaa sopivasti skaalatun kuvaajan painon kehityksestä.

Toteuta TiedostoTyokalut-luokkaan metodi:
public PainoMittaus[] lue()

Metodi pystyy lukemaan tiedostosta painotietoja ohjelman ymmärtämään muotoon, niin että ne saadaan osaksi kuvaajaa.


*************

Ohjelmiston tulisi toimia muun muassa kuten seuraavassa.


Example output:
Valikko
0) Lopeta
1) Lisää painokirjaus menneelle päivälle
2) Tulosta painokuvaaja
3) Lisää painokirjaus tälle päivälle
Anna valintasi (0, 1, 2 tai 3):
1
Anna paino (muodossa 9.9.2019,85): 
1.9.2019,52
Valikko
0) Lopeta
1) Lisää painokirjaus menneelle päivälle
2) Tulosta painokuvaaja
3) Lisää painokirjaus tälle päivälle
Anna valintasi (0, 1, 2 tai 3):
1
Anna paino (muodossa 9.9.2019,85): 
2.9.2019,48
Valikko
0) Lopeta
1) Lisää painokirjaus menneelle päivälle
2) Tulosta painokuvaaja
3) Lisää painokirjaus tälle päivälle
Anna valintasi (0, 1, 2 tai 3):
1
Anna paino (muodossa 9.9.2019,85): 
3.9.2019,49
Valikko
0) Lopeta
1) Lisää painokirjaus menneelle päivälle
2) Tulosta painokuvaaja
3) Lisää painokirjaus tälle päivälle
Anna valintasi (0, 1, 2 tai 3):
1
Anna paino (muodossa 9.9.2019,85): 
4.9.2019,55
Valikko
0) Lopeta
1) Lisää painokirjaus menneelle päivälle
2) Tulosta painokuvaaja
3) Lisää painokirjaus tälle päivälle
Anna valintasi (0, 1, 2 tai 3):
1
Anna paino (muodossa 9.9.2019,85): 
5.9.2019,48
Valikko
0) Lopeta
1) Lisää painokirjaus menneelle päivälle
2) Tulosta painokuvaaja
3) Lisää painokirjaus tälle päivälle
Anna valintasi (0, 1, 2 tai 3):
1
Anna paino (muodossa 9.9.2019,85): 
6.9.2019,53
Valikko
0) Lopeta
1) Lisää painokirjaus menneelle päivälle
2) Tulosta painokuvaaja
3) Lisää painokirjaus tälle päivälle
Anna valintasi (0, 1, 2 tai 3):
2
############                                     
########                                         
#########                                        
###############                                  
########                                         
#############                                    
Valikko
0) Lopeta
1) Lisää painokirjaus menneelle päivälle
2) Tulosta painokuvaaja
3) Lisää painokirjaus tälle päivälle
Anna valintasi (0, 1, 2 tai 3):
0
