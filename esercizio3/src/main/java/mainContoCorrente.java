
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
public class mainContoCorrente {
    
    public static void main (String[] args) {
        Date data1=new Date(2020,1,29,7,30,40);
        Date data2=new Date(2020,2,28,8,30,40);
        ContoCorrente Conto1=new ContoCorrente(1234, 4000, data1);
        ContoCorrente Conto2=new ContoCorrente(1235, 7000, data2);
        int soldi=2000;
        int newSaldo=Conto1.deposita(soldi);
        int newSaldo2=Conto1.preleva(soldi);
        int differenza=Conto1.differenza(Conto2);
        int newsomma=Conto1.somma(Conto2);
        boolean zero=Conto1.isZero();
        boolean negativo=Conto1.isNegativo();
        int confronto=Conto1.confronto(Conto2);
        String contocorrente=Conto1.toString();
        double interesse=2.30;
        double risinteresse=Conto2.interessi(interesse,data1);
        System.out.println("il nuovo saldo depositato vale: "+newSaldo);
        System.out.println("il nuovo saldo dopo il prelievo vale: "+newSaldo2);
        System.out.println("la differenza dei due conti vale: "+differenza);
        System.out.println("La somma dei due conti vale: "+newsomma);
        System.out.println("Risultato metodo isZero: "+zero);
        System.out.println("Risultato metodo isNegativo: "+negativo);
        System.out.println("Risultato metodo Confronto: "+confronto);
        System.out.println("Stringa del conto corrente: "+contocorrente);
        System.out.println("L'interessi del conto 2 vale: "+risinteresse);
}
}
