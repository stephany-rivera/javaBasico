package com.company.punto16;

import com.company.Input.Teclado;


public class Main {

    public static void comprobarPesoIdeal(Persona persona){
        if(persona.calcularIMC()==-1){
            System.out.println("Estas bajo de peso");
        }
        else if(persona.calcularIMC()==0){
            System.out.println("Estas en tu peso ideal");
        }
        else {
            System.out.println("Estas en sobrepeso");
        }
    }


    public static void main(String[] args) {
        System.out.println("Digite el nombre: ");
        String nombre= Teclado.input();
        System.out.println("Digite la edad: ");
        Integer edad= Teclado.inputInteger();
        System.out.println("Digite el sexo: ");
        Character sexo= Teclado.input().charAt(0);
        System.out.println("Digite el peso: ");
        Double peso= Teclado.inputDouble();
        System.out.println("Digite la altura");
        Double altura= Teclado.inputDouble();

        Persona persona1 = new Persona(nombre,edad,peso,altura,sexo);
        Persona persona2= new  Persona(nombre,edad,sexo);
        Persona persona3 = new Persona();
        persona3.setNombre("Stephanie");
        persona3.setEdad(24);
        persona3.setPeso(60.0);
        persona3.setAltura(1.65);
        persona3.setSexo('M');

        System.out.println("Persona 1:");
        System.out.println("Es mayor de edad: "+ persona1.esMayorDeEdad());
        System.out.println(persona1.toString());
        Main.comprobarPesoIdeal(persona1);

        System.out.println("Persona 2:");
        System.out.println("Es mayor de edad: "+ persona2.esMayorDeEdad());
        System.out.println(persona2.toString());
        Main.comprobarPesoIdeal(persona2);

        System.out.println("Persona 3:");
        System.out.println("Es mayor de edad: "+ persona3.esMayorDeEdad());
        System.out.println(persona3.toString());
        Main.comprobarPesoIdeal(persona3);


    }
}
