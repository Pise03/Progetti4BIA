
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class ProduciDato extends Thread{
    
    private LinkedBlockingQueue vuoto;
    private int val = 500;

    public ProduciDato(LinkedBlockingQueue vuoto) {
        this.vuoto = vuoto;
    }
    
    public void run(){
        for(int i = 0; i < 10; i++){
            val++;
            try {
                vuoto.put(val);
                System.out.println("Dato scritto: " + val + " e sono il Thread " + Thread.currentThread().getName()); //visibilità solo dentro le graffe del try catch
            } catch (InterruptedException ex) {
                Logger.getLogger(ProduciDato.class.getName()).log(Level.SEVERE, null, ex);
            }
            Prova.conta++;
            //System.out.println("Aggiunto elemento a Buffer e sono il Thread " + Thread.currentThread().getName() + " in posizione " + Prova.conta);
        }
    }
    
}
