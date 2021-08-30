
package Raices;


public class Menu extends Valor{
    
    
    public void opciones(){
        System.out.println("MENU");
        System.out.println("ELIGE UNA LETRA: 'A' PARA RAIZ CUBICA, 'B' PARA POTENCIA y 'C' PARA RAIZ CUADRADA");
        String op=super.read.next();
        extraer(op);
        
    }
    public void extraer(String op){
        char letra=op.charAt(0);
        
        Menu m=new Menu();
        
    }
    
}
