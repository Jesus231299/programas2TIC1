/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

public class Proceso extends Primero {

    double poten[] = new double[super.getContador()];

    public Proceso(double num1) {
        super(num1);
    }

    public void Potencia() {
        super.Potencia();//Herencia directa con el metodo de la super clase
        Math.pow(super.getNum1(), 2);
        super.setResulP(Math.pow(super.getNum1(), 2));
        System.out.println("EL RESULTADO ES " + super.getResulP());
        poten[super.getContador()] = super.getResulP();
        super.setContador(super.getContador() + 1);
        super.setAcumula(super.getAcumula() + super.getResulP());

    }

    public void Redondo() {
        super.Redondo();
        Math.round(super.getNum1());
        super.setRedondeo(Math.round(super.getRedondeo()));
        System.out.println("EL REDONDEO ES" + super.getRedondeo());
    }

    public void imprimir() {
        super.imprimir();
        for (int i = 0; i <= super.getContador(); i++) {
            System.out.println("EL ARREGLO ES" + poten[i]);

        }
    }

}
