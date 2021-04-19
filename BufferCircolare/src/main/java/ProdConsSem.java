
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class ProdConsSem {
    protected static int buffer;
    
    protected static Vector vettorino = new Vector(10);
    protected static int pointerProduttore = 0;
    protected static int pointerLettore = 0;
    
    public static void main(String args[]){
        Semaforo pieno = new Semaforo(0);
        Semaforo vuoto = new Semaforo(1);
        ProduciDato prod = new ProduciDato(pieno, vuoto);
        ConsumaDato cons1 = new ConsumaDato(pieno, vuoto);
        ConsumaDato cons2 = new ConsumaDato(pieno, vuoto);
        ConsumaDato cons3 = new ConsumaDato(pieno, vuoto);
        
        prod.start();
        
        cons1.start();
        cons2.start();
        cons3.start();
        
        System.out.println("Main: termine avvio thread");
    }
}
