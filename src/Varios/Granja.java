package Varios;
import java.util.Scanner;
public class Granja {
        int pollitos;
        int cajas;
        final int CABEN=35;
        public Granja(int p,int cj){
		pollitos=p;
                cajas=cj;
	}
        public void obtener(){
            cajas=pollitos/CABEN;
        }
        public void mostrar(){
            System.out.println("Se necesitan: "+cajas+" cajas");
        }
    public static void main(String[] args) {
        int cj=0;
        int p;
        Scanner leer=new Scanner(System.in); 
        System.out.println("Ingrese la cantidad de pollitos");
         p=leer.nextInt();
        Granja g=new Granja(p,cj);
        g.obtener();
        g.mostrar();
    }
}