/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class IncrementaDecrementaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        
        Integer x = 46;
        
        Thread Incrementa1 = new Thread(new Incremento(x));
        Thread Decrementa2 = new Thread(new Decremento(x));

        Incrementa1.start();
        Decrementa2.start();
    }

}
