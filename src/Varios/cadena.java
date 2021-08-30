package Varios;

import java.util.Scanner;

public class cadena {

    Scanner a = new Scanner(System.in);

    public String mens() {
        System.out.print("Dame la cadena");
        return a.next();
    }

    public void ciclo() {
        int m = 0;
        int c = 0;
        int acu = 0;
        for (m = 1; m <= 10; m++) {
            c = c + 1;
            System.out.println("Dame la cadena " + c);
            String cad = a.next();
            System.out.println("las frase es " + cad);
            System.out.println("Ingresa la posicion inicial");
            int p1 = a.nextInt();
            System.out.println("Ingresa la posicion final");
            int p2 = a.nextInt();
            String let = (String) cad.subSequence(p1, p2);
            int n = cad.compareToIgnoreCase(let);
            if (n == 0) {
                System.out.println("Son iguales");
            } else if (n > 0) {
                System.out.println("La primer palabra esta despues que la segunda");
            } else {
                System.out.println("La palabra:" + cad + " esta antes que:" + let);
            }
            acu = acu + 1;
            System.out.println("las frase final es: " + let);

        }
    }

    public static void main(String[] args) {
        cadena l = new cadena();
        l.ciclo();
    }

}
