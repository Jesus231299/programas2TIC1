package frase;

public class Subcadena2 {

    String cadena;

    public Subcadena2(String cadena) {
        this.cadena = cadena;
    }

    public String descomponer() {
        String segmento = cadena.substring(0, 2);
        return segmento;

    }

}
