
package Raices;


public class Redondeo {
    
    double resul;
    String ident;
    
    
    public Redondeo(double resul, String ident){
        this.ident=ident;
        this.resul=resul;
        
    }
    
    public void redondo(){
    double r = Math.round(resul);
    System.out.println("EL RENDONDEO DEL NUMERO " + resul + " ES: " + r);
    System.out.println("EL REDONDEO ES " +  Math.round(resul));
    }
    
}
