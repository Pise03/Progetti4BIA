
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class Consumatore extends Thread {

    Semaforo pieno;
    Semaforo votho;
    Spogliatoio spogliatoio;
    int giri = 1;

    public Consumatore(Semaforo pieno, Semaforo votho, Spogliatoio spogliatoio) {
        this.pieno = pieno;
        this.votho = votho;
        this.spogliatoio = spogliatoio;
    }

    public void run() {
            spogliatoio.Indossa();
            pieno.Rimuovi();
            InitialMain.turniDisp++;
            System.out.println("Adesso entra in pista: " + Thread.currentThread().getName());
            for (int i = 0; i < 15; i++) {
                System.out.println("Giro " + Thread.currentThread().getName() + " numero: " + giri);
                try {
                    sleep(250);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Consumatore.class.getName()).log(Level.SEVERE, null, ex);
                }
                giri++;
            }
            System.out.println(Thread.currentThread().getName() + " finisce i suoi giri!");
            spogliatoio.Togli();
            votho.Aggiungi();

    }
}
