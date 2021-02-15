package com.company.Punto5;

public class Punto5 {

    public static void imparesPares() {
        Integer numFinal = 1;
        while (numFinal <= 100) {
            if (numFinal % 2 == 0) {
                System.out.println(numFinal + " es par");
            } else {
                System.out.println(numFinal + "es impar");
            }
            numFinal++;
        }

    }

    public static void main(String[] args) {
        Punto5.imparesPares();
    }

}

