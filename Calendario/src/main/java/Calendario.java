import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alessandro
 */
public class Calendario {

    private Date data;

    public Calendario(Date data) {
        this.data = data;
    }

// Metodo per trovare il nome della giornata     
    
    public String giorno() {
        int giorno = data.getDay();
        String day = "null";
        if (giorno == 0) {
            day = "Domenica";
        } else if (giorno == 1) {
            day = "Lunedi";
        } else if (giorno == 2) {
            day = "Martedi";
        } else if (giorno == 3) {
            day = "Mercoledi";
        } else if (giorno == 4) {
            day = "Giovedi";
        } else if (giorno == 5) {
            day = "Venerdi";
        } else if (giorno == 6) {
            day = "Sabato";
        }
        System.out.println("La data equivale al giorno: " + day);
        return day;
    }

    
// Metodo per trovare il numero del giorno dopo    
    
    public int GiornoDopo() {
        int domani = data.getDate();
        int mese = data.getMonth();
        int year = data.getYear();
        boolean bisestile;

// Attraverso questo if guardo se l'anno in sui siamo è bisestile        
        if (year % 4 != 0) {
            bisestile = false;
        } else if (year % 400 == 0) {
            bisestile = true;
        } else if (year % 100 == 0) {
            bisestile = false;
        } else {
            bisestile = true;
        }

// In questo caso se è bisestile vado a mettere 29 invece che 1      
        if (mese == 1) {
            if (domani == 28 && bisestile == true) {
                domani = 29;
            } else if (domani == 28) {
                domani = 1;
            } else {
                domani++;
            }

        }

        if (mese == 0 || mese == 2 || mese == 4 || mese == 6 || mese == 7 || mese == 9 || mese == 11) {
            if (domani == 31) {
                domani = 1;
            } else {
                domani++;
            }
        }

        if (mese == 3 || mese == 5 || mese == 8 || mese == 10) {
            if (domani == 30) {
                domani = 1;
            } else {
                domani++;
            }

        }
        return domani;
    }
}


