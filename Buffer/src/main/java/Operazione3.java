/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class Operazione3 implements Runnable {
    Buffer dati;
    private double g = 3;
    private double c;
    
     public Operazione3(Buffer dati){
        this.dati = dati;
        c = dati.c;
    }
     
      public void run(){
        dati.z = g * (c-g);
          System.out.println("Ho calcolato il valore di z: " + dati.z);
    }
}
