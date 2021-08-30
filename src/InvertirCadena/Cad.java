package InvertirCadena;

import java.util.Scanner;

public class Cad extends Proceso {

    String ar[];
    Scanner read=new Scanner(System.in);
    int i, cant;

    public void IMP() {
        try {
            System.out.println("BIENVENIDO");
            System.out.println("Este programa invierte una cadena de caracteres");
            System.out.println("Cuantas cadenas quieres invertir?");
            cant=read.nextInt();
            ar=new String[cant];
            for(i=0;i<cant;i++) {
                System.out.println("Ingresa la cadena a invertir:");
                ar[i]=read.next();
                super.Voltear(ar[i]);
            }
        } catch (java.util.InputMismatchException x) {
            read.next();
            IMP();
        }
    }
}
