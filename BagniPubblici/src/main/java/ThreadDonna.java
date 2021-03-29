
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
public class ThreadDonna implements Runnable {
     private BagnoDonna x;

    public ThreadDonna(BagnoDonna x) {
        this.x = x;
    }
    
    public void run(){
        try {
            x.usoBagno();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadUomo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
}
