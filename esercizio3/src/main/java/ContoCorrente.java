
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
public class ContoCorrente {
    private int Numero_Conto;
    private int Saldo;
    private Date Data_apertura;
    
    public ContoCorrente(){
        Saldo=0;
        Numero_Conto=0;
        Data_apertura=new Date();
    }
    
    public ContoCorrente(int conto, int saldo, Date data){
        this.Numero_Conto=conto;
        this.Saldo=saldo;
        this.Data_apertura=data;
    }
    
    public int getConto(){
        return Numero_Conto;
    }
    
    public int getSaldo(){
        return Saldo;
    }
    
    public Date getData_apertura(){
        return Data_apertura;
    }
    
    public void setConto(int conto){
        this.Numero_Conto=conto;
    }
    
    public void setSaldo(int saldo){
        this.Saldo=saldo;
    }
    
    public void setData_apertura(Date data){
        this.Data_apertura=data;
    }
    
    public int deposita(int soldi){
        Saldo=Saldo+soldi;
        return Saldo;
    }
    
    public int preleva(int soldi){
        Saldo=Saldo-soldi;
        return Saldo;
    }
    
    public int differenza(ContoCorrente x){
        int newSaldo;
        if(Saldo>x.Saldo){
            newSaldo=Saldo-x.Saldo;
            return newSaldo;
        }
        else
            newSaldo=x.Saldo-Saldo;
        return newSaldo;
    }
    
    public int somma(ContoCorrente x){
        int newSaldo=Saldo+x.Saldo;
        return newSaldo;
    }
    
    public boolean isZero(){
        if(Saldo==0){
            return true;
        }
        else
            return false;
    }
    
    public boolean isNegativo(){
        if(Saldo<0){
            return true;
        }
        else
            return false;
    }
    
    public int confronto(ContoCorrente x){
        if(Saldo>x.Saldo){
            return 1;
        }
        else if(Saldo<x.Saldo){
            return -1;
        }
        else
            return 0;
    }
    
    public String toString(){
        String contocorrente=("Saldo:"+Saldo+" NumeroConto:"+Numero_Conto+" Date:"+Data_apertura);
        return contocorrente;
    }
    
    public double interessi(double interesse,Date x){
        long differenza=(Data_apertura.getTime() - x.getTime()) / (24*60*60*1000);
        double risinteresse=(Saldo*interesse/100)/365*differenza;
        return risinteresse;
    }
    
}
