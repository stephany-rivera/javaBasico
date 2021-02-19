package com.company.punto3;

import com.company.Input.Teclado;


public class Punto3 {

    public static void areaCirculo(){
        Double area,radio;
        System.out.println("Ingrese el radio: ");
        radio=Double.parseDouble(Teclado.input());
        area=Math.PI* Math.pow(radio,2);
        System.out.println(area);

    }

    public static void main(String[] args) {
        Punto3.areaCirculo();
    }

}
