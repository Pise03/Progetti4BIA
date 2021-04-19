
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
    Semaforo pieno;
    Semaforo vuoto;
    int tanti = 5;
    int attesa = 500;

    public ProduciDato(Semaforo pieno, Semaforo vuoto) {
        this.pieno = pieno;
        this.vuoto = vuoto;
    }
    
    public void run(){
        for(int i = 0; i < tanti; i++){
            try {
                vuoto.P();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProduciDato.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Scrittore: dato scriutto " + i);
            ProdConsSem.buffer = i;
            pieno.V();
            try {
                Thread.sleep(attesa);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProduciDato.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        System.out.println("Scrittore: dato termine scrittura dati");
    }//fine
}
