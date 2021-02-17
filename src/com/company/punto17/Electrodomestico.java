package com.company.punto17;

import java.awt.Color;

public class Electrodomestico {
    private Double precioBase;
    private String color;
    private Character consumoEnergetico;
    private Double peso;
    private static final String COLOR_BASE=Colores.BlANCO.toString();
    private static final Character CONSUMO_BASE=Consumo.F.toString().charAt(0);
    private static final Double PRECIO_BASE=100.0;
    private static final Double PESO_BASE=5.0;

    public Electrodomestico() {
        this.color=COLOR_BASE;
        this.consumoEnergetico=CONSUMO_BASE;
        this.precioBase=PRECIO_BASE;
        this.peso=PESO_BASE;
    }

    public Electrodomestico(Double precioBase, Double peso) {
        this();
        this.precioBase = precioBase;
        this.peso=peso;
    }

    public Electrodomestico(Double precioBase, String color, Character consumoEnergetico, Double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }


     public Boolean comprobarConsumoEnergetico(Character letra){
        letra= Character.toUpperCase(letra);
        for(Consumo consumo: Consumo.values()){
            if(letra==consumo.toString().charAt(0)){
                return Boolean.TRUE;
            }
        }
        this.consumoEnergetico=CONSUMO_BASE;
        return Boolean.FALSE;
    }

    public Boolean comprobarColor(String color) {
        color = color.trim();
        for (Colores colores : Colores.values()) {
            if (color == colores.toString()) {
                this.color = color;
                return Boolean.TRUE;
            }
        }
        this.color = COLOR_BASE;
        return Boolean.FALSE;
    }


    public Double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }
}
