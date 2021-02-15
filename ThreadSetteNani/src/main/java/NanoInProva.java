/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class NanoInProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Thread thread1 = new Thread(new ContaNani1(), "Brontolo");
        Thread thread2 = new Thread(new ContaNani1(), "Cucciolo");
        Thread thread3 = new Thread(new ContaNani1(), "Dotto.");
        Thread thread4 = new Thread(new ContaNani1(), "Eolo");
        Thread thread5 = new Thread(new ContaNani1(), "Gongolo");
        Thread thread6 = new Thread(new ContaNani1(), "Mammolo");
        Thread thread7 = new Thread(new ContaNani1(), "Pisolo");
        
        //faccio partire i thread
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
    }
    
}
