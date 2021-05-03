
import static java.lang.Thread.sleep;
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
public class Spogliatoio {

    Semaforo spogliatoio;

    public Spogliatoio(Semaforo spogliatoio) {

        this.spogliatoio = spogliatoio;
    }

    synchronized public void Indossa() {
        spogliatoio.Rimuovi();
        System.out.println(Thread.currentThread().getName() + " si mette la tuta");
        try {
            sleep(500); //tempo per mettersi la tuta
        } catch (InterruptedException ex) {
            Logger.getLogger(Spogliatoio.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(Thread.currentThread().getName() + " entra in pista");
        spogliatoio.Aggiungi();
    }

    synchronized public void Togli() {
        spogliatoio.Rimuovi();
        System.out.println(Thread.currentThread().getName() + " si toglie la tuta");
        try {
            sleep(500); //tempo per togliersi la tuta
        } catch (InterruptedException ex) {
            Logger.getLogger(Spogliatoio.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(Thread.currentThread().getName() + " finisce la giornata");
        spogliatoio.Aggiungi();
    }

}
