package Examenes;

public class Remedial { //class estaba mal escrito
	
	String sobrino1,sobrino2,sobrino3; //String tenia S miniuscula
	int años;
	final int E1=8,E2=12,E3=16; //falta int despues de final
	double dinero,canti,ds1,ds2,ds3; //tenia (;) envez de (,) para separar variables 
	
	public Remedial(double dinero,String sobrino1,String sobrino2,String sobrino3) {
		//las variables del contrictor estaban mal 
		this.sobrino1 = sobrino1;  //faltaba (this)
		this.sobrino2 = sobrino2;  //faltaba (this)
		this.sobrino3 = sobrino3;  //faltaba (this)
		this.dinero = dinero;      //faltaba (this)
	}
	
	public void totalAños(){
            años = E1+E2+E3; 
		
        }//faltaba cerrar {}
	
	public void dineroAño(){//faltaba cerrar {}
		canti=dinero/años;
        }
	
	public void asignacion(){//faltaba cerrar {}
		ds1=canti*E1;
		ds2=canti*E2;
		ds3=canti*E3;
        }
	
	public void resultados(){
		System.out.println("De los $:"+dinero+ " pesos a repartir, a cada sobrino le toca: ");
		System.out.println("A:"+sobrino1+" le toca:"+ds1);//tenia un (+) de mas y un 1 enves de (L)
		System.out.println("A:"+sobrino2+" le toca:"+ds2); //tenia 1 envez de (L
		System.out.println("A:"+sobrino3+" le toca:"+ds3);//las variables tenian (D)y no (d)
        }
	
	public static void main(String [] args){ //las llaves se cerraban antes 
            java.util.Scanner read=new java.util.Scanner(System.in);//faltaba la llamada de teclado
       double dinero;//pedir datos cantidad de dinero, nombre de tres sobrinos
       String nombre1;
       String nombre2;
       String nombre3;
       System.out.print("Ingresa el nombre del sobrino 1");//faltaba los datos a ingreesar
       nombre1=read.next();
       System.out.print("Ingresa el nombre del sobrino 2");//faltaba los datos a ingreesar
       nombre2=read.next();
       System.out.print("Ingresa el nombre del sobrino 3");//faltaba los datos a ingreesar
       nombre3=read.next();
       System.out.print("Ingresa el dinero");//faltaba los datos a ingreesar
       dinero=read.nextDouble();
		//pedir datos cantidad de dinero, nombre de tres sobrinos
		Remedial ayuda=new Remedial(dinero,nombre1,nombre2,nombre3);
		ayuda.totalAños();//falta(.)
		ayuda.dineroAño();//tenia (:)  //estaban mal escritos 
		ayuda.asignacion();//tenia (_)
		ayuda.resultados();//falta (.)
        }
}