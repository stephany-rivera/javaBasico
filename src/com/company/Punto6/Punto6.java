package com.company.Punto6;

public class Punto6 {

    public void imparesPares() {
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es par");
            } else {
                System.out.println(i + "es impar");
            }
        }

    }

    public static void main(String[] args) {
        Punto6 p6= new Punto6();
        p6.imparesPares();
    }


}
