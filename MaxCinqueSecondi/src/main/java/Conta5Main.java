import java.util.TimerTask;
import java.util.Timer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class Conta5Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        Thread n1 = new Thread(new Secondi(), "n1");
        
        Thread n2 = new Thread(new Secondi(), "n2");
       
        Thread n3 = new Thread(new Secondi(), "n3");
        
        n1.setPriority(10);
        n2.setPriority(5);
        n3.setPriority(1);
        
        n1.start();
        n2.start();
        n3.start();
    }

    
}
