package Varios;

import java.util.Scanner;

public class Meses {

    public int meses() {
        Scanner read = new Scanner(System.in);
        System.out.println("Dame tu numero");
        int mes = read.nextInt();
        return mes;
    }

    public void mesess() {
        Scanner read = new Scanner(System.in);
        System.out.println("Dame tu numero");
        int mes = read.nextInt();
        elegir(mes);
        estaciones(mes);
    }

    public void elegir(int mes) {
        switch (meses()) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("ERROR, dato no valido");
        }
    }

    public void estaciones(int mes) {
        switch (meses()) {
            case 3:
            case 4:
            case 5:
                System.out.println("PRIMAVERA");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("VERANO");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("OTOÑO");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("INVIERNO");
                break;
            default:
                System.out.println("no valido");
        }
    }

    public static void main(String[] args) {
        Meses val = new Meses();
        val.mesess();
    }
}
