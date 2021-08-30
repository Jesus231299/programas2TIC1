package Operaciones;

public class Primero {

    private double resulP, redondeo, num1, acumula = 0;
    private int contador = 0;

    public Primero(double num1) {
        setNum1(num1);

    }

    public double getResulP() {
        return resulP;
    }

    public void setResulP(double resulP) {
        this.resulP = resulP;
    }

    public double getRedondeo() {
        return redondeo;
    }

    public void setRedondeo(double redondeo) {
        this.redondeo = redondeo;
    }

    public double getNum1() {
        return num1;
    }

    private void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getAcumula() {
        return acumula;
    }

    public void setAcumula(double acumula) {
        this.acumula = acumula;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void Potencia() {//Herencia de metodos, con sobre escritura
        System.out.println("CALCULANDO POTENCIA");
    }

    public void Redondo() {
        System.out.println("CALCULANDO UN REDONDEO");

    }

    public void imprimir() {
        System.out.println("IMPRIMIENDO...1, 2, 3");
    }

}
