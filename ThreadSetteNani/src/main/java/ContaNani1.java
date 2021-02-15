/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class ContaNani1 implements Runnable {
   public ContaNani1(){
   }
   
   public void run(){
       for(int i=0;i<7;i++){
           System.out.println((i+1) + " " + Thread.currentThread().getName() );
       }
   }
}
