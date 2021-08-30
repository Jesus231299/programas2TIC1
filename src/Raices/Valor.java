
package Raices;
import java.util.Scanner;

public class Valor {
    Scanner read =new Scanner(System.in);
    
  
    public double pedir(){
        System.out.println("Ingresa un numero con decimales");
        double de=read.nextDouble();
        return de;

    }
}
