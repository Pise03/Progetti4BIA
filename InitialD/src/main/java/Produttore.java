/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class Produttore extends Thread {

    Semaforo pieno;
    Semaforo votho;
    int turni = 10;

    public Produttore(Semaforo pieno, Semaforo votho) {
        this.pieno = pieno;
        this.votho = votho;
    }

    public void run() {
        while(true) {
            votho.Rimuovi();
            
            pieno.Aggiungi();
        }
    }
}
