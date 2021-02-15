package com.company.Punto1;

import com.company.Input.Teclado;

public class Punto1 {

    public static void numeroMayor(Double numero1, Double numero2){
        if(numero1>numero2){
            System.out.println("El número 1: "+numero1 + " es mayor que "+ numero2);
        }
        else if(numero1<numero2){
            System.out.println("El numero 1: "+numero1 + " es menor que "+ numero2);
        }
        else{
            System.out.println("El "+ numero1+ " es igual que el "+ numero2);
        }
    }


    public static void main(String[] args) {
      Punto1.numeroMayor(40.5,30.2);
      Punto1.numeroMayor(50.0,50.0);
      Punto1.numeroMayor(15.4,48.6);

    }
}
