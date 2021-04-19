
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
public class ProduciDato extends Thread {

    Semaforo pieno;
    Semaforo vuoto;
    int tanti = 10;
    int attesa = 500;

    public ProduciDato(Semaforo pieno, Semaforo vuoto) {
        this.pieno = pieno;
        this.vuoto = vuoto;
    }

    public void run() {
        for (int i = 0; i < tanti; i++) {
            
 //           if (ProdConsSem.pointerProduttore < tanti) {
 //               ProdConsSem.vettorino.add(ProdConsSem.pointerProduttore, attesa + i);
 //               ProdConsSem.pointerProduttore++;
 //           } else if (ProdConsSem.pointerProduttore >= tanti) {
 //               ProdConsSem.pointerProduttore = 0;
 //               ProdConsSem.vettorino.add(ProdConsSem.pointerProduttore, attesa + i);
 //               ProdConsSem.pointerProduttore++;
 //           }
            try {
                vuoto.P();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProduciDato.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Scrittore: dato aggiunto ai vettore vettorino in posizione " + ProdConsSem.pointerProduttore);
            ProdConsSem.buffer = i;
            pieno.V();
            pieno.ScrivoSulVettorino();
            try {
                Thread.sleep(attesa);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProduciDato.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        System.out.println("Scrittore: termine scrittura dati ner vettore");
    }//fine
}
