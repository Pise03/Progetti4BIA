
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class Secondi implements Runnable {
 
    public Secondi(){
    }

    public void run(){
        long start = System.currentTimeMillis();
        long end = start + 5000;
        int i = 0;
        while(System.currentTimeMillis() < end){
            i++;
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        Thread.currentThread().interrupt();
    }

    }
 
