import java.util.Vector;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class piatto  {
    private String nome;
    private String tipo;
    private Vector ingredienti=new Vector (1,1);
    private double prezzotot;

// costruttori
    
    public piatto(String nome, String tipo){
        this.nome=nome;
        this.tipo=tipo;
    }
    
/**    public piatto(String nome, String tipo, ingredienti x){
        this.nome=nome;
        this.tipo=tipo;
        ingredienti.addElement(x);
    }
    
    public piatto(piatto x){
        nome=x.nome;
        tipo=x.tipo;
        ingredienti=x.ingredienti;
    }
     */
    
// get e set    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Vector getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(Vector ingredienti) {
        this.ingredienti = ingredienti;
    }
    
        public double getPrezzotot() {
        return prezzotot;
    }

    public void setPrezzotot(double prezzotot) {
        this.prezzotot = prezzotot;
    }
    
// aggiungi altri ingredienti al vettore     
    
    public void inserisci(ingredienti x){
        ingredienti.addElement(x);
    }
    
// rimuovi alcuni ingredienti al vettore

    public boolean rimuovi(ingredienti x){
        for(int i=0; i<ingredienti.size(); i++){
            if(ingredienti.elementAt(i).equals(x)){
                ingredienti.removeElementAt(i);
                return true;
            }
        }
        return false;
    }     
    
// metodo per calcorale il prezzo totale dell'ordine
   
   public double prezzotot(){
       for(int i=0;i<ingredienti.size();i++){
           ingredienti x = (ingredienti) ingredienti.elementAt(i);
           prezzotot += x.getPrezzo();
       }
       return prezzotot;      
    }
}
