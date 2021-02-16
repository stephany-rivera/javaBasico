package com.company.punto13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Punto13 {

    public static void fecha() {
        LocalDateTime fechaActual = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String formattedDate = fechaActual.format(myFormatObj);
        System.out.println("Fecha y hora actual: " + formattedDate);
    }

    public static void main(String[] args) {
        Punto13.fecha();
    }
}
