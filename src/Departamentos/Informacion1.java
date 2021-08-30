package Departamentos;
import java.util.Scanner;
public class Informacion1 {
Scanner leer=new Scanner(System.in);  
    
    //version 2.1 del reposaitorio en git

    public String pideUbicacion(){
    System.out.println("Ingresa la ubucacion");
    String u=leer.next();
    return u;
}

    public double obtenerAhorro(){
    System.out.println("Ingresa el ahorro por departamento");
    double a=leer.nextDouble(); 
    return a;
}

    public int obtenerPisos(){
    System.out.println("Ingresa el total de plantas");
    int p=leer.nextInt(); 
    return p;
}

    public int obtenerDeptos(){
    System.out.println("Ingresa el total de departamentos");
    int d=leer.nextInt();  
    return d;
}

    public void comparte(){
        Administracion1 a=new Administracion1(pideUbicacion(),obtenerAhorro(),obtenerPisos(),obtenerDeptos());
        a.compartir();
    }
public static void main (String [] args){

Informacion1 i=new Informacion1();
i.comparte();
} 
}






