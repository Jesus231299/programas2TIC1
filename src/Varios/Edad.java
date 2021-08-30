package Varios;

import java.util.Scanner;

public class Edad {

    String nombre;
    int añonaci;

    public Edad(String nombre, int añonaci) {
        this.nombre = nombre;
        this.añonaci = añonaci;
    }

    public int calculaEdad() {
        int ed = 2018 - añonaci;
        return ed;
    }

    public int calculaDias() {
        int di = calculaEdad() * 365;
        return di;
    }

    public int calculaHoras() {
        int ho = calculaDias() * 24;
        return ho;
    }

    public int calculaMinutos() {
        int mi = calculaHoras() * 60;
        return mi;
    }

    public void imprimir() {
        System.out.println("Tu nombres es:" + nombre);
        System.out.println("Tienes :" + calculaEdad() + " años viviendo");
        System.out.println("Tienes :" + calculaDias() + " dias viviendo");
        System.out.println("Tienes :" + calculaHoras() + " horas viviendo");
        System.out.println("Tienes :" + calculaMinutos() + " minutos viviendo");
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre ");
        String n = leer.next();
        System.out.println("Ingresa tu año de nacimiento");
        int eda = leer.nextInt();

        Edad persona = new Edad(n, eda);
        persona.calculaEdad();
        persona.calculaDias();
        persona.calculaHoras();
        persona.calculaMinutos();
        persona.imprimir();
    }
}
