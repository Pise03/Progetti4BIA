
import java.util.concurrent.LinkedBlockingQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class Prova {
    protected static int conta = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        LinkedBlockingQueue vuota = new LinkedBlockingQueue(10);
        
        ConsumaDato cons1 = new ConsumaDato(vuota);
        ConsumaDato cons2 = new ConsumaDato(vuota);
        ConsumaDato cons3 = new ConsumaDato(vuota);
        
        ProduciDato prod1 = new ProduciDato(vuota);
        ProduciDato prod2 = new ProduciDato(vuota);
        ProduciDato prod3 = new ProduciDato(vuota);
        
        prod1.start();
        prod2.start();
        prod3.start();
        
        cons1.start();
        cons2.start();
        cons3.start();
        
        prod1.join();
        prod2.join();
        prod3.join();
        
        cons1.stop();
        cons2.stop();
        cons3.stop();
        
    }
    
}


//fare il join per terminare tutti i thread, sia 