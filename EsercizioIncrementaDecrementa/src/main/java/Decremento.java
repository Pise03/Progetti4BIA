/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Decremento implements Runnable {

    Integer x;

    public Decremento(Integer x) {
        this.x = x;
    }

    public void run() {
        while (1 == 1) {
            if (x > 0) {
                x--;
                System.out.println("Sto decrementando" + x);

            }
        }
    }
}
