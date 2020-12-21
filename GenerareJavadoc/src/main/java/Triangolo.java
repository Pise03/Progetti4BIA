/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */

//immaginiamo un triangolo a,b,c in senso antiorario

public class Triangolo {
    public double ab;
    public double bc;
    public double ac;

    public Triangolo(double ab, double bc, double ac) {
        this.ab = ab;
        this.bc = bc;
        this.ac = ac;
    }
    
// Metodo per classificare i triangoli; 1=equilatero 2=isoscele 3=rettagolo 4=scaleno     
    
    public int Classifica(){
        if((ab==bc) && (ab==ac) && (bc==ac)){
            return 1;
        }
        else if((ab==bc) || (bc==ac) || (ab==ac)){
            return 2;
        }
        else if((bc==Math.sqrt((ab*ab)+(ac*ac)))){
            return 3;
        }
        else
            return 4;
    }
    
//metodi per area e perimetro    
 
    public double perimetro(){
       double perimetro=0;
       perimetro=ab+bc+ac;
       return perimetro;
    }
    
    public double area(double altezza){
        int classifica;
        double area=0;
        classifica=Classifica();
        if(classifica==3){
            area=(ac*ab)/2;
            return area;
        }
        else
            area=(ab*altezza)/2;
            return area;
    }
}
