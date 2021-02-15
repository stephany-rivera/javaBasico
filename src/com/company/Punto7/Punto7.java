package com.company.Punto7;

import com.company.Input.Teclado;

public class Punto7 {
    public void ciclo() {
        Double numero;
        do {
            System.out.println("Digite un número menor que 0");
            numero = Teclado.inputDouble();
        }
        while (numero >= 0);
    }


    public static void main(String[] args) {
        Punto7 p7 = new Punto7();
        p7.ciclo();
    }


}
