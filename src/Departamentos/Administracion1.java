package Departamentos;
import Departamentos.Informacion1;
import Departamentos.Informe1;
public class Administracion1 {
    
    
    //version 1.0 del reposaitorio en git
    
String ubica;
double cantidad;
int plantas;
int deptos;

public Administracion1(String ubica,double cantidad,int plantas,int deptos){
    this.ubica=ubica;
    this.cantidad=cantidad;
    this.plantas=plantas;
    this.deptos=deptos;
}    
public double calcularPiso (){
    double pago=cantidad*deptos;
    return pago;
}
public double calcularEdificio (){
    double p2=calcularPiso()*plantas;
    return p2;
}
public void compartir (){
    Informe1 i=new Informe1(ubica,calcularPiso(),calcularEdificio());
    i.mostrarAhorro();

}

}
