/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class ristoranteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    // Il prezzo è in euro
        ingredienti rapa= new ingredienti("Rapa", 5, 3);
        ingredienti pomodoro= new ingredienti("Pomodoro", 3, 5);
        ingredienti cipolla=new ingredienti("Pomodoro", 10, 7);
        piatto pasta=new piatto("Pasta","primo",pomodoro);
        piatto insalata=new piatto("Insalata", "secondo", rapa);
        insalata.inserisci(cipolla);
        System.out.println("Gli ingredienti per il piatto insalata sono: ");
        for(int i=0; i<insalata.getIngredienti().size();i++){
            ingredienti x = (ingredienti) insalata.getIngredienti().elementAt(i);
             System.out.println(x.getDescrizione());
        }
        
    }
    
}
