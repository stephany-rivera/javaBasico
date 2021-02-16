package com.company.punto14;

import com.company.Input.Teclado;

public class Punto14 {

    public void numeros() {
        Integer numero = 0;
        System.out.println("Digite un número hasta el 1000");
        numero= Teclado.inputInteger();
        for (int i = numero; i <= 1000; i += 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Punto14 p14 = new Punto14();
        p14.numeros();
    }


}
