package com.padillatomas.interfaces.impl;

import com.padillatomas.interfaces.CocheCRUD;

public class CocheCRUDImpl implements CocheCRUD {

//    Constructor:
    public CocheCRUDImpl() {
    }

//    Metodos:
    @Override
    public void save() {
        System.out.println("Save Method Called");
    }

    @Override
    public void findAll() {
        System.out.println("FindAll Method Called");
    }

    @Override
    public void delete() {
        System.out.println("Delete Method Called");
    }
}
