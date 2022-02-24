package com.padillatomas;

import com.padillatomas.interfaces.CocheCRUD;
import com.padillatomas.interfaces.impl.CocheCRUDImpl;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 5:");

        CocheCRUD myCoche = new CocheCRUDImpl();

        myCoche.save();
        myCoche.findAll();
        myCoche.delete();

    }
}
