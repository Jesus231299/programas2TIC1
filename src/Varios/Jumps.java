package Varios;
import java.util.Scanner;
public class Jumps {
        double salto_1;
        double salto_2;
        double salto_3;
        double suma_saltos;
        double dif;
        final double record=30;
        public Jumps(double salto_1, double salto_2, double salto_3, double suma_saltos, double dif) {
        this.salto_1 = salto_1;
        this.salto_2 = salto_2;
        this.salto_3 = salto_3;
        this.suma_saltos = suma_saltos;
        this.dif = dif;
    }
    public void suma(){
        suma_saltos = salto_1 + salto_2 + salto_3;
    }
    public void diferencia(){
        dif = record - suma_saltos;
    }
    public void mostrar(){
        System.out.println("La suma de los saltos es de: "+suma_saltos+" metros");
        System.out.println("La diferencia al record es de: "+dif+" metros");
    }
    public static void main(String[] args) {
        double salto_1;
        double salto_2;
        double salto_3;
        double suma_saltos=0;
        double dif=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Metros del salto 1");
        salto_1 = leer.nextInt();
        System.out.println("Metros del salto 2");
        salto_2 = leer.nextInt();
        System.out.println("Metros del salto 3");
        salto_3 = leer.nextInt();
        Jumps jp=new Jumps(salto_1, salto_2, salto_3,suma_saltos,dif);
        jp.suma();
        jp.diferencia();
        jp.mostrar();
    }
}
