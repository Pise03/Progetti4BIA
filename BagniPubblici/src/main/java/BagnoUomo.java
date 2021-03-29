/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class BagnoUomo{
    
    private boolean occupato;

    public BagnoUomo(){
        this.occupato = false;
    }

    public boolean isOccupato() {
        return occupato;
    }
    
    synchronized void usoBagno() throws InterruptedException{
        if(occupato == false){
            System.out.println(Thread.currentThread().getName() + " è entrato nel bagno");
            occupato = true;
            Thread.sleep(5000);
            occupato = false;
        }
        else
            System.out.println("bagno occupato");
    }
}
