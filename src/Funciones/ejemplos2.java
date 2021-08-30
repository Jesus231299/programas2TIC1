package Funciones;

import java.util.Scanner;

public class ejemplos2 {

    Scanner teclado = new Scanner(System.in);

    public void caracter() {
        System.out.println("Ingresa una cadena");
        String cadena = teclado.next();
        System.out.println("Ingresa un numero para la posicion del caracter");
        int posi = teclado.nextInt();
        char letra = cadena.charAt(posi);
        System.out.println("El caracter que ocupa la posicion:" + posi + 1 + "es:" + letra);
        System.out.println("2 El caracter que ocupa la posicion" + posi + "es" + cadena.charAt(posi) + 1);
    }

    public void longitud() {
        System.out.println("Ingresa una cadena");
        String cadena = teclado.next();
        int tam = cadena.length();
        System.out.println("La cadena:" + cadena + " tiene:" + tam + " caracteres");
        System.out.println("La cadena:" + cadena + " tiene:" + cadena.length() + "caracteres");
    }

    public void comparacion() {
        System.out.println("Ingresa una cadena");
        String cadena1 = teclado.next();
        System.out.println("Ingresa otra cadena");
        String cadena2 = teclado.next();
        int n = cadena1.compareToIgnoreCase(cadena2);
        System.out.println("El numero es:" + n);
        if (n == 0) {
            System.out.println("Son iguales");
        } else if (n > 0) {
            System.out.println("La primer palabra esta despues que la segunda");
        } else {
            System.out.println("La palabra:" + cadena1 + " esta antes que:" + cadena2);
        }
    }

    public void subcadena() {
        System.out.println("Ingresa una cadena");
        String cadena = teclado.next();
        System.out.println("Ingresa la posicion inicial");
        int p1 = teclado.nextInt();
        System.out.println("Ingresa la posicion final");
        int p2 = teclado.nextInt();
        String nueva = cadena.substring(p1, p2);
        System.out.println("La nueva cadena es:" + nueva);
    }

    public void remplazo() {
        System.out.println("Ingresa una cadena");
        String cadena = teclado.next();
        System.out.println("Ingresa la parte a remplazar");
        String existe = teclado.next();
        System.out.println("Ingresa su reemplazo");
        String cambio = teclado.next();
        String nueva = cadena.replaceAll(existe, cambio);
        System.out.println("El reemplazo es:" + nueva);
    }

    public static void main(String[] args) {
        ejemplos2 srt = new ejemplos2();
        //srt.caracter();
        //srt.longitud();
        //srt.comparacion();
        //srt.subcadena();
        srt.remplazo();

    }
}
