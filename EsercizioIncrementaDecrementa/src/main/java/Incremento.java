/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Incremento implements Runnable {

    Integer x;

    public Incremento(Integer x) {
        this.x = x;
    }

    public void run() {
        while (1 == 1) {
            if (x < 100) {
                x++;
                System.out.println("Sto incrementando" + x);
            }
        }

    }
}
