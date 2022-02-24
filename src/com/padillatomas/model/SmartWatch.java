package com.padillatomas.model;

public class SmartWatch extends SmartDevice{

//    Atributos Propios:
    public boolean hasPulsometro;
//    Constructor:
    public SmartWatch(String marca, String modelo, String memoria, String ram, boolean hasPulsometro) {
        super(marca, modelo, memoria, ram);
        this.hasPulsometro = hasPulsometro;
    }

}
