/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class Syncronization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BagnoUomo b1 = new BagnoUomo();
        BagnoDonna b2 = new BagnoDonna();
        Thread uomo1 = new Thread(new ThreadUomo(b1), "uomo1");
        Thread uomo2 = new Thread(new ThreadUomo(b1), "uomo2");
        Thread donna1 = new Thread(new ThreadDonna(b2), "donna1");
        Thread donna2 = new Thread(new ThreadDonna(b2), "donna2");
        
        uomo1.start();
        uomo2.start();
        donna1.start();
        donna2.start();
        
        
        
    }
    
}
