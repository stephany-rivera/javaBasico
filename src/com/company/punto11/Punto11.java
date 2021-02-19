package com.company.punto11;

import com.company.Input.Teclado;

public class Punto11 {

    public void contarVocales() {
        System.out.println("Digita una frase");
        String frase = Teclado.input();
        Integer longitud = frase.length();
        Integer contarA = 0, contarE = 0, contarI = 0, contarO = 0, contarU = 0, contarTotal = 0;

        for (int i = 0; i < longitud; i++) {
            if (frase.charAt(i) == 'a') {
                contarA += 1;
            } else if (frase.charAt(i) == 'e') {
                contarE += 1;
            } else if (frase.charAt(i) == 'i') {
                contarI += 1;
            } else if (frase.charAt(i) == 'o') {
                contarO += 1;
            } else if (frase.charAt(i) == 'u') {
                contarU += 1;
            }

        }
        contarTotal = contarA + contarE + contarI + contarO + contarU;
        System.out.println("Cantidad vocales: " + contarTotal);
        System.out.println("a: " + contarA + "\ne: " + contarE + "\ni:" + contarI + "\no: " + contarO + "\nu: " + contarU);

    }

    public static void main(String[] args) {
        Punto11 p11= new Punto11();
        p11.contarVocales();
    }

}
