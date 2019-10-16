/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painosovellus;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */
public class Pvm {
    private Date paivamaara;

    public Pvm(int paiva, int kuukausi, int vuosi) throws ParseException {
        String pvm = paiva + "." + kuukausi + "." + vuosi;
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        this.paivamaara = df.parse(pvm);
    }

    public Pvm() {
        this.paivamaara = new Date();
    }

    public Date getPaivamaara() {
        return paivamaara;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        String pvm = df.format(this.paivamaara);
        return pvm;
    }
}
