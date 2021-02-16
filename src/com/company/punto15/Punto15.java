package com.company.punto15;

import com.company.Input.Teclado;

public class Punto15 {

    public void mostrarMenu() {
        System.out.println("**** Gestión cinematográfica ****");
        System.out.println("1. Nuevo actor");
        System.out.println("2. Buscar actor");
        System.out.println("3. Eliminar actor");
        System.out.println("4. Modificar actor");
        System.out.println("5. Ver todos los actores");
        System.out.println("6. Ver peliculas de los actores");
        System.out.println("7. Ver categoria de las peliculas de los actores");
        System.out.println("8. Salir");
    }

    public void ciclo() {
        Integer eleccion=0;
        do {
            mostrarMenu();
            System.out.println("Seleccione la opción del menú que desea: ");
            eleccion = Teclado.inputInteger();
        }
        while (eleccion != 8);
    }


    public static void main(String[] args) {
        Punto15 p15 = new Punto15();
        p15.ciclo();
    }
}
