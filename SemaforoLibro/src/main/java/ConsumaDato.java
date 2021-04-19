
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
public class ConsumaDato extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    int dato;

    public ConsumaDato(Semaforo pieno, Semaforo vuoto) {
        this.pieno = pieno;
        this.vuoto = vuoto;
    }
    public void run(){
        while(dato < 4){
            try {
                pieno.P();
            } catch (InterruptedException ex) {
                Logger.getLogger(ConsumaDato.class.getName()).log(Level.SEVERE, null, ex);
            }
            dato = ProdConsSem.buffer;
            System.out.println("lettore: dato letto " + dato);
            vuoto.V();
            
        }
    }
    
}
