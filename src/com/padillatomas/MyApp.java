package com.padillatomas;

import com.padillatomas.model.SmartPhone;
import com.padillatomas.model.SmartWatch;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4:");

        SmartPhone myPhone = new SmartPhone("Apple", "12 Pro", "128GB", "64GB", "4k");
        SmartWatch myWatch = new SmartWatch("Apple", "Apple Watch", "64GB", "8GB", true);

        System.out.println("=== Mi Telefono ===");
        System.out.println("Marca -> " + myPhone.marca);
        System.out.println("Modelo -> " + myPhone.modelo);
        System.out.println("Memoria -> " + myPhone.memoria);
        System.out.println("RAM -> " + myPhone.ram);
        System.out.println("Calidad Videos -> " + myPhone.calidadVideos);

        System.out.println("");

        System.out.println("=== Mi Reloj ===");
        System.out.println("Marca" + myWatch.marca);
        System.out.println("Modelo" + myWatch.modelo);
        System.out.println("Memoria -> " + myWatch.memoria);
        System.out.println("RAM -> " + myWatch.ram);
        System.out.println("Tiene Pulsometro -> " + myWatch.hasPulsometro);
    }
}
