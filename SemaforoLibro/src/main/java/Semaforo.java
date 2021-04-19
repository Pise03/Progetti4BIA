/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class Semaforo {
    int valore;

    public Semaforo(int valore) {
        this.valore = valore;
    }
    
    synchronized public void P() throws InterruptedException{
        while(valore == 0){
            wait();
        }
        valore --;
    }//end P
    
    synchronized public void V(){
        valore++;
        notify();
    }//end V
}
