/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class Operazioni4 implements Runnable {
    Buffer dati;
    private double y;
    private double z;
    
    public Operazioni4(Buffer dati){
        this.dati = dati;
        y = dati.y;
        z = dati.z;
    }
    
    public void run(){
        dati.t = y * z;
        System.out.println("Ho calcolato il valore di t: " + dati.t);
    }
    
}
