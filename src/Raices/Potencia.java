
package Raices;


public class Potencia {
   double base, pote;
    
    public Potencia(double pote, double base){
        this.base=base;
        this.pote=pote;
    }
    
    public void operar(){
        double res=Math.pow(pote, base);
         System.out.println("lA POTENCIA ES " + res);
        
         
    }
    public void comparte(){
        
    }    
}
