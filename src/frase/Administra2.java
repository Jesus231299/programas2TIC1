package frase;

public class Administra2 extends Cadenas2 {    //clase derivada de Cadenas2

    Comparacion2 c = new Comparacion2();

    public void control() {

        String anterior, actual;
        String fra = "";//acomulador de Cadenas2
        int i = 0;

        for (i = 1; i <= 10; i++) {
            String temp = super.captura();//aplicacion de herencia directa con un metodo
            Subcadena2 sub = new Subcadena2(temp);
            fra += sub.descomponer();//acumulando los 2 primeros caracteres de cada 
            //cadena que se envia a la clase Subcadena2

            c.almacena(temp);
            System.out.println("Los caracteres son:" + sub.descomponer());
        }
        imprime(fra);
    }

    public void imprime(String fra) {
        System.out.println("La frase es: " + fra);
    }

    public static void main(String[] args) {
        Administra2 play = new Administra2();
        play.control();

    }

}
