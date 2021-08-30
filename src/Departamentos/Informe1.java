package Departamentos;
import Departamentos.Informacion1;
public class Informe1 {    
String ub;   
double piso;
double edificio;

public Informe1(String ub,double piso,double edificio){
this.ub=ub;
this.piso=piso;
this.edificio=edificio;
}

    
public void mostrarAhorro (){
System.out.println("La ubicacion es:"+ub);
System.out.println("La paga por piso es de "+piso);
System.out.println("La paga total es de:"+edificio);
}    
}
