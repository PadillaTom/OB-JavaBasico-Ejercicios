package com.padillatomas.model;

public class SmartPhone extends SmartDevice{

//    Atributos Propios:
    public String calidadVideos;

//    Constructor:
    public SmartPhone(String marca, String modelo, String memoria, String ram, String calidadVideos) {
        super(marca, modelo, memoria, ram);
        this.calidadVideos =  calidadVideos;
    }

//    Metodos:

}
