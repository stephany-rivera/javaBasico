package com.company.Punto9;

import com.company.Input.Teclado;

public class Punto9 {
    private final String TEXTO_BASE = "La sonrisa sera la mejor arma contra la tristeza";

    public void conversionTexto() {
        String nuevoTexto = TEXTO_BASE.replaceAll("a", "e");
        System.out.println("Inserte un texto: ");
        nuevoTexto = nuevoTexto.concat(Teclado.input());
        System.out.println(nuevoTexto);
    }

    public static void main(String[] args) {
        Punto9 p9 =new Punto9();
        p9.conversionTexto();
    }
}
