/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class ingredienti{
    private String descrizione;
    private int quantita;
    private double prezzo;
    
// costruttori    
    
    public ingredienti(){
       descrizione="";
       quantita=0;
       prezzo=0;
    }
    
    public ingredienti(String descrizione, int quantita, double prezzo){
       this.descrizione=descrizione;
       this.prezzo=prezzo;
       this.quantita=quantita;
    }
    
    public ingredienti(ingredienti x){
        this.descrizione=x.descrizione;
        this.prezzo=x.prezzo;
        this.quantita=x.quantita;
    }

// metodi get e set    
    
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
    
}

