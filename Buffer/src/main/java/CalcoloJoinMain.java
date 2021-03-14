
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
public class CalcoloJoinMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buffer parziale = new Buffer(2,3,4);
        Thread n1 = new Thread(new Operazione1(parziale), "x");
        Thread n2 = new Thread(new Operazione2(parziale), "y");
        Thread n3 = new Thread(new Operazione3(parziale), "z");
        Thread n4 = new Thread(new Operazioni4(parziale), "t");
        Thread n5 = new Thread(new Operazione5(parziale), "k");
        
        n1.start();
        n2.start();
        n3.start();
        
        try {
            n2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(CalcoloJoinMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            n3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(CalcoloJoinMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        n4.start();
        
        try {
            n1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(CalcoloJoinMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            n4.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(CalcoloJoinMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        n5.start();
        
        try {
            n5.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(CalcoloJoinMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
