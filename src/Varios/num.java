package Varios;

import java.util.Scanner;

public class num {

    Scanner teclado = new Scanner(System.in);

    public void aleatorio() {
        int n = 0;
        int max = 0;
        int acupotencia = 0;
        int acunumeros = 0;
        int acuredo = 0;
        int contpo = 0;
        System.out.println("Cuantos numeros quieres?");
        max = teclado.nextInt();
        for (n = 1; n <= max; n++) {
            acunumeros = acunumeros + 1;
            double num = Math.random();
            System.out.println("El numero es: " + num + " Numero aleatorio:" + acunumeros);
            double r = Math.round(num);
            acuredo = acuredo + 1;
            System.out.println("El redondeo es: " + r + "Numero de redondeo:" + acuredo);
            double res = Math.pow(r, r);
            acupotencia = acupotencia + 1;
            System.out.println("La potencia es: " + res + " Numero de potencia:" + acupotencia);
            contpo = acupotencia * acupotencia;
        }
        System.out.println("............");
        System.out.println("La suma de la potencias es de: " + acupotencia);
        int pro = acupotencia;
        System.out.println("El promedio de las potencias es de :" + pro);
        System.out.println("-------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        num po = new num();
        po.aleatorio();
    }
}
