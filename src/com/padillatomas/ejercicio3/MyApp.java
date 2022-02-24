package com.padillatomas.ejercicio3;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2: ");

        String[] myArray = {"Tomas", "Padilla", "Java Basico", "OpenBootcamp!"};

        System.out.println("=== Comenzamos FOR Loop ===");
        for(String item : myArray){
            System.out.println(item);
        }
        System.out.println("=== Finalizamos FOR Loop ===");
    }
}
