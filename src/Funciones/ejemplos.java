package Funciones;

import java.util.Scanner;

public class ejemplos {

    Scanner teclado = new Scanner(System.in);

    public void potencia() {
        System.out.println("Dame un numero");
        int n1 = teclado.nextInt();
        System.out.println("Dame la potencia");
        int n2 = teclado.nextInt();
        double res = Math.pow(n1, n2);
        System.out.println("La potencia es:" + res);
        System.out.println("La Potencia Es:" + Math.pow(n1, n2));

    }

    public void aleatorio() {
        double num = Math.random();
        System.out.println("Dame el numero limite");
        int limite = teclado.nextInt();
        num = Math.random() * limite;
        System.out.println("El numero es" + num);
    }

    public void raiz() {
        System.out.println("Dame un numero");
        int nera = teclado.nextInt();
        double rc2 = Math.sqrt(nera);
        System.out.println("El numero es:" + rc2);
        System.out.println("El numero es:" + Math.sqrt(nera));
    }

    public void minimo() {
        System.out.println("Dame un numero");
        double m1 = teclado.nextDouble();
        System.out.println("Dame otro numero");
        double m2 = teclado.nextDouble();
        Math.min(m1, m2);
        System.out.println("El numero menor es" + Math.min(m1, m2));
    }

    public void redondeo() {
        System.out.println("Dame um numero");
        double x = teclado.nextDouble();
        double r = Math.round(x);
        System.out.println("El redondeo es:" + r);
    }

    public static void main(String[] args) {
        ejemplos po = new ejemplos();
        // po.potencia();
        po.aleatorio();
        //po.raiz();
        //po.minimo();
        //po.redondeo();
    }
}
