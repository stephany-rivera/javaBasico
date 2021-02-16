package com.company.punto12;

import com.company.Input.Teclado;

public class Punto12 {

    public void compararDosPalabras() {
        String palabra1;
        String palabra2;
        System.out.println("Ingrese la primera: ");
        palabra1 = Teclado.input();
        System.out.println("Ingrese la segunda: ");
        palabra2 = Teclado.input();

        if (palabra1.equals(palabra2)) {
            System.out.println("La palabra 1: " + palabra1 + " es igual a la palabra 2 :" + palabra2);
        } else {
            for (int i = 0; i < palabra1.length(); i++) {
                if (i == palabra2.length() - 1) {
                    break;
                }
                if (palabra1.charAt(i) != palabra2.charAt(i)) {
                    System.out.println("La letra " + palabra1.charAt(i) + " : es diferente de " + palabra2.charAt(i));
                }
            }
        }


    }

    public static void main(String[] args) {
        Punto12 p12 = new Punto12();
        p12.compararDosPalabras();
    }


}
