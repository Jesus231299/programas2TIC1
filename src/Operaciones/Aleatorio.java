package Operaciones;

public class Aleatorio {

    public double Pedir() {
        double alt = Math.random() * 10000;
        return alt;

    }

    public void Administra() {
        String cad = null;
        Primero si;//creacion del objeto de la super clase
        do {
            si = new Proceso(Pedir());//polimorfismo controlar la llamada a los metodos de clases derivadas 
            si.Potencia();
            si.Redondo();
            si.imprimir();

        } while (cad.equalsIgnoreCase("S"));

    }

    public static void main(String[] args) {
        Aleatorio read = new Aleatorio();
        read.Administra();
    }

}
