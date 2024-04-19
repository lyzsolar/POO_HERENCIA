package com.lyzsolar.carwash2.models;

import java.util.ArrayList;

public class Empleado {
    private String id;
    private String name;
    private String lastName;
    private String secondName;

    public Empleado(String id, String name, String lastName, String secondName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.secondName = secondName;
    }

    public Empleado(String nombre, double precio, String descripcion) {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondName() {
        return secondName;
    }
    private Usuario usuario;
}
