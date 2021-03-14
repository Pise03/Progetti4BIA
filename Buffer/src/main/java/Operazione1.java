/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class Operazione1 implements Runnable {
    Buffer dati;
    private double h = 1;
    private double g = 3;
    private double a;
    
    public Operazione1 (Buffer dati){
        this.dati = dati;
        a = dati.a;
    }
    
    public void run(){
        dati.x = g * (a-h);
        System.out.println("Ho calcolato il valore di x: " + dati.x);
    }
    
}
