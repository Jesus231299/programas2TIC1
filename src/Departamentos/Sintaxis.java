//inicio de programa
/*primer programa de java
 * indicando la sintaxis de cada elemento
 */

package Departamentos;
//sintaxis para definir paquete
//package nombrePaquete;

//uso de librer�as, sintaxis
//import nombrePaquete.nombreClase; (se coloca siempre entre package y public class)

import java.util.Scanner;
//Scanner es una clase de java que se utiliza para capturar/leer datos desde teclado.

public class Sintaxis {
	//sintaxis para definir clase
	//modificadorAcceso class nombreClase{...}
	//publico, protegido, privado, indeterminado
	
	//para utilizar una clase (Scanner) es necesario crear objetos
	//sintaxis para crear objetos de cualquier clase
	//nombreClase nombreObjeto=new Constructor();
	static Scanner leer=new Scanner(System.in);
	
	//declaraci�n de atributos
	//tipoDato identificador; (variable)
	//final tipoDato IDENTIFICADOR=valor; (constante)
	
	String nombre;
	int año, edad;
	
	final int ACTUAL=2018;
	
	//definicion de m�todos
	//modificadorAcceso tipoDevolucion identificador(){...}
	
	public void ingresar() {
		
	}
	//declaraci�n de constructor
	public Sintaxis(String n,int nace){
		//recibe informaci�n que comparte con las 
		//variables declaradas en la clase
		//inicializaci�n
		//variableClase=variableConstructor;
		nombre = n;
		año = nace;
	}
	
	public void calcular() {
		edad= ACTUAL-año;
	}
	
	
	public void mostrar() {
		//importar mensajes
		//salidaSistema.tipoMensaje(valoresMostrados);
		System.out.println("Hola "+nombre+" tienes "+edad+" a�os :V" );
		
	}
	
	//sintaxis de main
	//modificadorAcceso static tipoDevolucion main(arreglo cadenas){...}
	public static void main (String [] args){
		String n;
		int nace;
		System.out.println("INGRESA TU NOMBRE: ");
		//asignacion y captura de cadena
		//variableAsignacion=objetoScanner.nextTipoDato();
		//objetoScanner.nextInt(); lee enteros
		//objetoScanner.nextDouble(); lee reales de tipo double
		//objetoScanner.nextFloat(); lee reales de tipo flotante
		//objetoScanner.next(); lee una linea
		n=leer.nextLine();
		System.out.println("INGRESA TU AÑO DE NACIMIENTO: ");
		nace=leer.nextInt();
		
		
		//para utilizar a los m�todos de cualquier clase
		//se debe crear un objeto de sicha clase
		//con el objeto creado se podran llamar a sus
		//m�todos.
		
		//PARA CREAR EL OBJETO DE CUALQUIER CLASE nombreClase nombreObjeto=new Constructor();
		
		Sintaxis persona=new Sintaxis(n,nace);
		//con el objeto se llaman los m�todos;
		//objeto.nombreMetodo();
		persona.calcular();
		persona.mostrar();
		
	}

}
