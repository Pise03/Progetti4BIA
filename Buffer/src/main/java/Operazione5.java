/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class Operazione5 implements Runnable {

    Buffer dati;
    private double x;
    private double t;

    public Operazione5(Buffer dati) {
        this.dati = dati;
        x = dati.x;
        t = dati.t;
    }

    public void run() {
        dati.k = x + t;
        System.out.println("Ho calcolato il valore di k: " + dati.k);
    }
}
