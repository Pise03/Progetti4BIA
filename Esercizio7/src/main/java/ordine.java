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
public class ordine {
    public static int numero = 0;
    protected Vector<piatto> lista;
    protected double prezzotot;
    
// costruttori

    public ordine(Vector<piatto> lista, double prezzotot) {
        this.lista = lista;
        this.prezzotot = prezzotot;
    }
    

    
    
// metodi get e set

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

    public double getPrezzotot() {
        return prezzotot;
    }

    public void setPrezzotot(double prezzotot) {
        this.prezzotot = prezzotot;
    }

    
// metodo per inserire altri piatti nel vettore lista
    
    public void aggiungi(piatto x){
        lista.addElement(x);
    }
    
// metodo per rimuovere alucuni piatti al piatto
    
    public boolean rimuovi(piatto x){
        for(int i=0; i<lista.size(); i++){
            if(lista.elementAt(i).equals(x)){
                lista.removeElementAt(i);
                return true;
            }
        }
        return false;
    }
    
// metodo che ritorna vero se nell'ordine è presente un piatto di nome dato
   
   public boolean containsPiatto(String nomepiatto){
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).getNome().equals(nomepiatto)){
                return true;
            }
        }
        return false;
    }
    
  
}
