package frase;

public class Comparacion2 {

    String[] palabras = new String[10];
    int contador = 0;

    public void almacena(String valor) {
        palabras[contador] = valor;
        contador += 1;
    }

    public void mostrar() {
        for (int a = 0; a <= 9; a++) {
            System.out.println("palabra:" + (a + 1) + " " + palabras[a]);
        }
    }

}

/*(Arreglos ) son colecciones de datos de un mismo tipo (primitivos)
o bien colecciones de varios tipo de datos mediante objetos*/
