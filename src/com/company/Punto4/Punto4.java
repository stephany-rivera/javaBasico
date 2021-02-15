package com.company.Punto4;

import com.company.Input.Teclado;

public class Punto4 {
    private Double IVA=0.21;

    public void calcularPrecioIva(){
        Double precio, precioIva;
        System.out.println("Digite el precio del producto: ");
        precio= Teclado.inputDouble();
        precioIva=precio+precio*this.IVA;
        System.out.println("El precio con el precio del IVA es: "+ precioIva);
    }

    public static void main(String[] args) {
        Punto4 p4= new Punto4();
        p4.calcularPrecioIva();
    }
}
