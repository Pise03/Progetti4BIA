/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class DinDonDanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //TODO code application logic here
      //parte il primo thread senza nemmeno stare a creare la variabile
      new Thread(new Campana("din", 5)).start();
      
      //inizializzo un nuovo thread Campana
      
      Thread camp1 = new Thread(new Campana("dan", 5));
      camp1.start();
      
      Thread camp2 = new Thread(new Campana("dan", 5));
      camp2.start();
      
      
      
      
    }
    
}
