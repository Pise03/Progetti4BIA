/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class Operazione2 implements Runnable {

    Buffer dati;
    private double g = 2;
    private double b;

    public Operazione2(Buffer dati) {
        this.dati = dati;
        b = dati.b;
    }

    public void run() {
        dati.y = g * (b - g);
        System.out.println("Ho calcolato il valore di y: " + dati.y);
    }
}
