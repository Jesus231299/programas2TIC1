package Varios;

public class listas {

    public void ascendente() {
        System.out.println("lista ascendente");

        for (int lista = 20; lista <= 50; lista++) {
            System.out.println(lista);

        }

    }

    public void descendente() {
        int c = 0, s = 0;
        System.out.println("lista Descendente");
        for (int x = 100; x >= 50; x = x - 5) {
            c = c + 1;
            s = s + x;
            System.out.println(x);
        }
        System.out.println("se imprimieron" + c);
        System.out.println("la suma es" + s);
    }

    public static void main(String[] args) {
        listas num = new listas();
        num.ascendente();
        //num.descendente();
    }

}
