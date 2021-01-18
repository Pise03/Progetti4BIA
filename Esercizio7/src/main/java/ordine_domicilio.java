import java.sql.Time;
import java.util.Vector;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class ordine_domicilio extends ordine {
    protected String indirizzo;
    protected Time ora;
    protected static double costo_fisso = 10.0;
    
//costruttore

    public ordine_domicilio(String indirizzo, Time ora) {
        this.indirizzo = indirizzo;
        this.ora = ora;
        numero++;
    }

//get e set
        
    public void setPrezzotot(double prezzotot) {
        this.prezzotot = prezzotot;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Time getOra() {
        return ora;
    }

    public void setOra(Time ora) {
        this.ora = ora;
    }

    public static double getCosto_fisso() {
        return costo_fisso;
    }

    public static void setCosto_fisso(double costo_fisso) {
        ordine_domicilio.costo_fisso = costo_fisso;
    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        ordine.numero = numero;
    }

    public Vector<piatto> getLista() {
        return lista;
    }

    public void setLista(Vector<piatto> lista) {
        this.lista = lista;
    }



// Metodo per ottenere il prezzo   

    public double Prezzo(){
        double p=0;
        for(int i=0; i<lista.size();i++){
            p += lista.get(i).getPrezzotot();
        }
        return p;
    }
    
    
}
