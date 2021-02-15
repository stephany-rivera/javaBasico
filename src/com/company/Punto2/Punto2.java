package com.company.Punto2;

import com.company.Input.Teclado;
import com.company.Punto1.Punto1;

public class Punto2 {
    private Double numero1;
    private Double numero2;

    public void ingresarNumeros(){
        System.out.println("Ingrese el número 1: ");
        this.numero1= Double.parseDouble(Teclado.input());
        System.out.println("Ingrese el número 2: ");
        this.numero2= Double.parseDouble(Teclado.input());
        Punto1.numeroMayor(this.numero1,this.numero2);
    }

    public static void main(String[] args) {
        Punto2 p2= new Punto2();
        p2.ingresarNumeros();

    }
}