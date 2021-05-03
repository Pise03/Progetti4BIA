/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class InitialMain {

    /**
     * @param args the command line arguments
     */
    public static int turniDisp = 0;

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

        Semaforo pieno = new Semaforo(4);
        Semaforo vuoto = new Semaforo(0);
        Semaforo sp = new Semaforo(2);
        
        Spogliatoio spogliatoio = new Spogliatoio(sp);

        Produttore prod = new Produttore(pieno, vuoto);

        Thread pilota1 = new Thread(new Consumatore(pieno, vuoto, spogliatoio), "pilota1");
        Thread pilota2 = new Thread(new Consumatore(pieno, vuoto, spogliatoio), "pilota2");
        Thread pilota3 = new Thread(new Consumatore(pieno, vuoto, spogliatoio), "pilota3");
        Thread pilota4 = new Thread(new Consumatore(pieno, vuoto, spogliatoio), "pilota4");
        Thread pilota5 = new Thread(new Consumatore(pieno, vuoto, spogliatoio), "pilota5");
        Thread pilota6 = new Thread(new Consumatore(pieno, vuoto, spogliatoio), "pilota6");
        Thread pilota7 = new Thread(new Consumatore(pieno, vuoto, spogliatoio), "pilota7");
        Thread pilota8 = new Thread(new Consumatore(pieno, vuoto, spogliatoio), "pilota8");

        //Consumatore pilota2 = new Consumatore(pieno, vuoto); 
        //Consumatore pilota3 = new Consumatore(pieno, vuoto); 
        //Consumatore pilota4 = new Consumatore(pieno, vuoto); 
        //Consumatore pilota5 = new Consumatore(pieno, vuoto); 
        //Consumatore pilota6 = new Consumatore(pieno, vuoto); 
        //Consumatore pilota7 = new Consumatore(pieno, vuoto); 
        //Consumatore pilota8 = new Consumatore(pieno, vuoto); 
        
        prod.start();

        pilota1.start();
        pilota2.start();
        pilota3.start();
        pilota4.start();
        pilota5.start();
        pilota6.start();
        pilota7.start();
        pilota8.start();

        pilota1.join();
        pilota2.join();
        pilota3.join();
        pilota4.join();
        pilota5.join();
        pilota6.join();
        pilota7.join();
        pilota8.join();

        prod.stop();

    }

}
