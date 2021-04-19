/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class Semaforo {
    int valore;

    public Semaforo(int valore) {
        this.valore = valore;
    }
    
    synchronized public void P() throws InterruptedException{
        while(valore == 0){
            wait();
        }
        valore --;
    }//end P
    
    synchronized public void V(){
        valore++;
        notify();
    }//end V
    
    synchronized public void ScrivoSulVettorino(){
        if (ProdConsSem.pointerProduttore < 10) {
                ProdConsSem.vettorino.add(ProdConsSem.pointerProduttore, 20 + ProdConsSem.pointerProduttore);
                ProdConsSem.pointerProduttore++;
            } else if (ProdConsSem.pointerProduttore >= 10) {
                ProdConsSem.pointerProduttore = 0;
                ProdConsSem.vettorino.add(ProdConsSem.pointerProduttore, 20 + ProdConsSem.pointerProduttore);
                ProdConsSem.pointerProduttore++;
            }
    }
    
        synchronized public void LeggoSulVettorino(){
        if (ProdConsSem.pointerLettore < 10) {
                System.out.println("lettore: guarda caro ho letto il contenuto del vettore nella posizione " + ProdConsSem.pointerLettore + " e ho trovato: " + ProdConsSem.vettorino.elementAt(ProdConsSem.pointerLettore) + " e mi chiamo " + Thread.currentThread().getName());
                ProdConsSem.pointerLettore++;
            } else if (ProdConsSem.pointerLettore >= 10) {
                ProdConsSem.pointerLettore = 0;
                System.out.println("lettore: guarda caro ho letto il contenuto del vettore nella posizione " + ProdConsSem.pointerLettore + " e ho trovato: " + ProdConsSem.vettorino.elementAt(ProdConsSem.pointerLettore) + " e mi chiamo " + Thread.currentThread().getName());
                ProdConsSem.pointerLettore++;
            }
    }
}
