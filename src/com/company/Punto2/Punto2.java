package com.company.Punto2;

import com.company.Input.Teclado;

public class Punto2 {
    private Double numero1;
    private Double numero2;

    public static void numeroMayor(Double numero1, Double numero2){
        if(numero1>numero2){
            System.out.println("El número 1: "+numero1 + "es mayor que "+ numero2);
        }
        else if(numero1==numero2){
            System.out.println("El "+ numero1+ "Es igual que el "+ numero2);
        }
        else{
            System.out.println("El numero 1: "+numero1 + "es menor que "+ numero2);

        }
    }

    public void ingresarNumeros(){
        System.out.println("Ingrese el número 1: ");
        this.numero1= Double.parseDouble(Teclado.input());
        System.out.println("Ingrese el número 2: ");
        this.numero2= Double.parseDouble(Teclado.input());

        numeroMayor(this.numero1,this.numero2);

    }

    public static void main(String[] args) {


    }
}