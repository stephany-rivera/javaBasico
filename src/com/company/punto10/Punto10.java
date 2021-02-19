package com.company.punto10;

import com.company.Input.Teclado;

public class Punto10 {

    public static void eliminarEspaciosBlanco(){
        String frase;
        System.out.println("Ingrese una frase linda: ");
        frase= Teclado.input();
        frase=frase.replaceAll(" ","");
        System.out.println(frase);
    }

    public static void main(String[] args) {
        Punto10.eliminarEspaciosBlanco();
    }
}
