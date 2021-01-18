
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
public class ordine_tavolo extends ordine{
    protected int nuemro_tavolo;
    protected String nome_cameriere;

//costruttore    

    public ordine_tavolo(int nuemro_tavolo, String nome_cameriere) {
        this.nuemro_tavolo = nuemro_tavolo;
        this.nome_cameriere = nome_cameriere;
        numero++;
    }
 
    
// get e set
    public int getNuemro_tavolo() {
        return nuemro_tavolo;
    }

    public void setNuemro_tavolo(int nuemro_tavolo) {
        this.nuemro_tavolo = nuemro_tavolo;
    }

    public String getNome_cameriere() {
        return nome_cameriere;
    }

    public void setNome_cameriere(String nome_cameriere) {
        this.nome_cameriere = nome_cameriere;
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

 // metodo per ottenre il prezzo totale
    
    public double prezzo(){
        double p=0;
        for(int i=0; i<lista.size(); i++){
            p += lista.get(i).getPrezzotot();
        }
        return p;
    }
}
