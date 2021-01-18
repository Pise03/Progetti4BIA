
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 * @version 1.0
 */
public class Ristorante {

    private Vector elenco_piatti = new Vector(1, 1);
    private Vector ordinazioni = new Vector(1, 1);
    private double prezzoGiornaliero;
    private Vector elencoOrdinato = new Vector(1, 1);

    public Vector getElenco_piatti() {
        return elenco_piatti;
    }

    public void setElenco_piatti(Vector elenco_piatti) {
        this.elenco_piatti = elenco_piatti;
    }
    
    

    public Vector getElencoOrdinato() {
        return elencoOrdinato;
    }

    public void setElencoOrdinato(Vector elencoOrdinato) {
        this.elencoOrdinato = elencoOrdinato;
    }
    
    

/** metodo per inserire i piatti disponibili nel vettore ristorante */
    public void aggiungiPiatti(piatto x) {
        elenco_piatti.addElement(x);

    }

/** metodo per rimuovere piatti al ristorante */  
    public boolean rimuovi(piatto x) {
        for (int i = 0; i < elenco_piatti.size(); i++) {
            if (elenco_piatti.elementAt(i).equals(x)) {
                elenco_piatti.removeElementAt(i);
                return true;
            }
        }
        return false;
    }

/** metodo per inserire gli ordini disponibili nel vettore ristorante */   
    public void aggiungiOrdinazioni(ordine x) {
        ordinazioni.addElement(x);
    }

/** metodo per rimuovere le ordinazioni al ristorante */    
    public boolean rimuoviOrdinazioni(ordine x) {
        for (int i = 0; i < ordinazioni.size(); i++) {
            if (ordinazioni.elementAt(i).equals(x)) {
                ordinazioni.removeElementAt(i);
                return true;
            }
        }
        return false;
    }

/** metodo per cambiare ordine */
    public boolean cambioOrdine(ordine x, int numeroOrdine) {
        if (numeroOrdine >= 0 && numeroOrdine < elenco_piatti.size()) {
            elenco_piatti.set(numeroOrdine, x);
            return true;
        } else {
            return false;
        }
    }

/** metodo per trovare l'incasso giornaliero */
    public double incassoGiornaliero() {
        for (int i = 0; i < ordinazioni.size(); i++) {
            ordine x = (ordine) ordinazioni.elementAt(i);
            prezzoGiornaliero += x.getPrezzotot();
        }
        return prezzoGiornaliero;
    }

/** metodo per trovare il prezzo più grande */
    public double importoMaggiore() {
        double prezzo1 = 0;
        double prezzoPlus = 0;
        for (int i = 0; i < ordinazioni.size(); i++) {
            ordine x = (ordine) ordinazioni.elementAt(i);
            prezzo1 = x.getPrezzotot();
            if (prezzo1 > prezzoPlus) {
                prezzoPlus = prezzo1;
            }
        }
        return prezzoPlus;
    }

/** metodo per creare una lista di piatti in ordine crescente */
    public void elencoOrdinato() {
        double prezzo1 = 0;
        double prezzoMin = 0;
        int posizione = 0;
        double prezzoLast = 0;
        Object clone = elenco_piatti.clone();
        Vector copia = (Vector) clone;
        while (copia.size() > 0) {
            for (int i = 0; i < copia.size(); i++) {
                ordine x = (ordine) copia.elementAt(i);
                prezzo1 = x.getPrezzotot();
                if (prezzo1 < prezzoMin) {
                    prezzoMin = prezzo1;
                    posizione = i;
                }
            }
            elencoOrdinato.addElement(prezzoMin);
            copia.removeElementAt(posizione);
        }
        ordine x = (ordine) copia.elementAt(0);
        prezzoLast = x.getPrezzotot();
        elencoOrdinato.addElement(prezzoLast);
    }

/** metodo per outputtare una stringa con i relativi contenuti di del vettore elenco e ordinazioni */
    public void stringa() {
        for (int i = 0; i < elenco_piatti.size(); i++) {
            System.out.println(elenco_piatti.elementAt(i).toString());
        }
        for (int i = 0; i < ordinazioni.size(); i++) {
            System.out.println(ordinazioni.elementAt(i).toString());
        }
    }

/** metodo per ritornare gli ordini fatti da un solo cameriere */
    public Vector<ordine> getOrdiniCameriere(String nome) {
        Vector<ordine> lista = new Vector();
        for (int i = 0; i < ordinazioni.size(); i++) {
            ordine nuovo = (ordine) ordinazioni.elementAt(i);
            if (((ordine_tavolo) nuovo).getNome_cameriere().equals(nome)) {
                lista.add(nuovo);
            }
        }
        return lista;
    }
    
    
}
