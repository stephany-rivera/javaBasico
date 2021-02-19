package com.company.punto8;

import com.company.Input.Teclado;

public class Punto8 {

    public void diaSemana() {
        System.out.println("Digite el día de la semana en números: ");
        Integer dia= Teclado.inputInteger();
        switch (dia) {
            case 1:
                System.out.println("Día laboral");
                break;
            case 2:
                System.out.println("Día laboral");
                break;
            case 3:
                System.out.println("Día laboral");
                break;
            case 4:
                System.out.println("Día laboral");
                break;
            case 5:
                System.out.println("Día laboral");
                break;
            case 6:
                System.out.println("Día NO laboral");
                break;
            case 7:
                System.out.println("Día NO laboral");
                break;
            default:
                System.out.println("No es un día valido");
                break;
        }
    }

    public static void main(String[] args) {
        Punto8 p8 = new Punto8();
        p8.diaSemana();
    }
}
