
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
public class ConsumaDato extends Thread {
    
    private LinkedBlockingQueue vuota;

    public ConsumaDato(LinkedBlockingQueue vuota) {
        this.vuota = vuota;
    }
    
    public void run(){
        while(true){
            try {  
                Object value = vuota.take();
                System.out.println("Dato letto: " + value + " e sono il Thread " + Thread.currentThread().getName()); //visibilità solo dentro le graffe del try catch
            } catch (InterruptedException ex) {
                Logger.getLogger(ConsumaDato.class.getName()).log(Level.SEVERE, null, ex);
            }
            //Prova.conta--;
            //System.out.println("Preso elemento a Buffer in posizione " + value + " e sono il Thread " + Thread.currentThread().getName());
        }
    }
    
    
    
    
    
}
