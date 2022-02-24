package com.padillatomas.ejercicio2;

import java.util.Scanner;

public class MyApp {
    /**
     * Punto de entrada a la App Java.
     * Permite ejecutar la application
     * @param args - Argumentos de entrada para la app.
     */
    public static void main(String[] args) {
        Scanner fetchDouble = new Scanner(System.in);
        System.out.println("Ingrese el precio del articulo: ");
        Double precio = fetchDouble.nextDouble();

        System.out.println("===================");
        System.out.println("Precio Total:" + precioTotal(precio, 7.7));
        System.out.println("===================");

    }

    static Double precioTotal(Double precioInicial, Double porcentajeIva){
        System.out.println("Precio: " + precioInicial + "|| IVA: " + porcentajeIva +"%.");
        System.out.println("Calculando...");
        Double subtotal = (precioInicial*porcentajeIva) / 100;
        return subtotal + precioInicial;
    }
}
