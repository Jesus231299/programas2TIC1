package Varios;

import java.util.Scanner;

public class validacion {

    public void edad() {
        Scanner read = new Scanner(System.in);
        System.out.println("ingresa monto de cotizacion");
        double cotiza = read.nextDouble();

        if (cotiza >= 10000 & cotiza <= 18000) {
            System.out.println("Comprala compa");
        } else {
            System.out.println("No la compre compa");
        }
    }

    public void multipleIF() {
        Scanner read = new Scanner(System.in);
        System.out.println("Competencias");
        System.out.println("Ingresa tu matricula");
        String m = read.next();
        System.out.println("Ingresa tu promedio");
        float pro = read.nextFloat();
        if (pro == 0) {
            System.out.println("Tu competencia es:SE ");
        } else if (pro >= 0 & pro <= 7.5) {
            System.out.println("Tu competencia es:NA ");
        } else if (pro >= 7.5 & pro < 8.5) {
            System.out.println("Tu competencia es:SA ");
        } else if (pro >= 8.5 & pro < 9.5) {
            System.out.println("Tu competencia es:DE ");
        } else if (pro >= 9.5 & pro <= 10) {
            System.out.println("Tu competencia es:AU ");
        } else {
            System.out.println("Error, promedio no valido");
        }
    }

    public static void main(String[] args) {
        validacion compra = new validacion();
        // compra.edad();
        compra.multipleIF();
    }
}
